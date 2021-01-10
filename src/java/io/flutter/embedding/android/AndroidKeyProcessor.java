/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.KeyCharacterMap
 *  android.view.KeyEvent
 *  android.view.inputmethod.InputConnection
 *  android.view.inputmethod.InputMethodManager
 *  java.lang.Character
 *  java.lang.Object
 */
package io.flutter.embedding.android;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.engine.systemchannels.KeyEventChannel;
import io.flutter.plugin.editing.TextInputPlugin;

public class AndroidKeyProcessor {
    private int combiningCharacter;
    private final KeyEventChannel keyEventChannel;
    private final TextInputPlugin textInputPlugin;

    public AndroidKeyProcessor(KeyEventChannel keyEventChannel, TextInputPlugin textInputPlugin) {
        this.keyEventChannel = keyEventChannel;
        this.textInputPlugin = textInputPlugin;
    }

    private Character applyCombiningCharacterToBaseCharacter(int n2) {
        if (n2 == 0) {
            return null;
        }
        Character c2 = Character.valueOf((char)((char)n2));
        boolean bl = (Integer.MIN_VALUE & n2) != 0;
        if (bl) {
            int n3 = n2 & Integer.MAX_VALUE;
            int n4 = this.combiningCharacter;
            if (n4 != 0) {
                n3 = KeyCharacterMap.getDeadChar((int)n4, (int)n3);
            }
            this.combiningCharacter = n3;
            return c2;
        }
        int n5 = this.combiningCharacter;
        if (n5 != 0) {
            int n6 = KeyCharacterMap.getDeadChar((int)n5, (int)n2);
            if (n6 > 0) {
                c2 = Character.valueOf((char)((char)n6));
            }
            this.combiningCharacter = 0;
        }
        return c2;
    }

    public void onKeyDown(KeyEvent keyEvent) {
        if (this.textInputPlugin.getLastInputConnection() != null && this.textInputPlugin.getInputMethodManager().isAcceptingText()) {
            this.textInputPlugin.getLastInputConnection().sendKeyEvent(keyEvent);
        }
        Character c2 = AndroidKeyProcessor.super.applyCombiningCharacterToBaseCharacter(keyEvent.getUnicodeChar());
        this.keyEventChannel.keyDown(new KeyEventChannel.FlutterKeyEvent(keyEvent, c2));
    }

    public void onKeyUp(KeyEvent keyEvent) {
        Character c2 = AndroidKeyProcessor.super.applyCombiningCharacterToBaseCharacter(keyEvent.getUnicodeChar());
        this.keyEventChannel.keyUp(new KeyEventChannel.FlutterKeyEvent(keyEvent, c2));
    }
}

