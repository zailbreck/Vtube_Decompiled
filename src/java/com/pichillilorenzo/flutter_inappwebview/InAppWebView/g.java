/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.webkit.WebSettings
 *  android.webkit.WebSettings$LayoutAlgorithm
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.g$a
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.j
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.pichillilorenzo.flutter_inappwebview.InAppWebView;

import android.os.Build;
import android.webkit.WebSettings;
import com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView;
import com.pichillilorenzo.flutter_inappwebview.InAppWebView.g;
import com.pichillilorenzo.flutter_inappwebview.InAppWebView.j;
import f.g.a.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class g
implements l<InAppWebView> {
    public Boolean A;
    public Boolean B;
    public Boolean C;
    public Boolean D;
    public Boolean E;
    public Boolean F;
    public Boolean G;
    public Integer H;
    public Boolean I;
    public Boolean J;
    public Boolean K;
    public Boolean L;
    public String M;
    public Boolean N;
    public Boolean O;
    public Integer P;
    public String Q;
    public Integer R;
    public Integer S;
    public String T;
    public Integer U;
    public String V;
    public String W;
    public Integer X;
    public Boolean Y;
    public WebSettings.LayoutAlgorithm Z;
    public Boolean a;
    public Boolean a0;
    public Boolean b;
    public Boolean b0;
    public Boolean c;
    public Integer c0;
    public Boolean d;
    public Integer d0;
    public String e;
    public Boolean e0;
    public String f;
    public Boolean f0;
    public Boolean g;
    public String g0;
    public Boolean h;
    public String h0;
    public Boolean i;
    public String i0;
    public Boolean j;
    public Boolean j0;
    public Integer k;
    public Boolean k0;
    public Boolean l;
    public Boolean l0;
    public Boolean m;
    public Boolean m0;
    public List<String> n;
    public String n0;
    public List<Map<String, Map<String, Object>>> o;
    public Integer o0;
    public Integer p;
    public Boolean p0;
    public Boolean q;
    public Integer q0;
    public Boolean r;
    public Integer r0;
    public Boolean s;
    public Integer s0;
    public Boolean t;
    public Boolean t0;
    public Boolean u;
    public Integer u0;
    public Boolean v;
    public Map<String, Object> v0;
    public Boolean w;
    public Boolean w0;
    public Boolean x;
    public Boolean x0;
    public Boolean y;
    public Boolean y0;
    public Integer z;

    public g() {
        Integer n2;
        Boolean bl;
        Boolean bl2;
        Integer n3;
        Integer n4 = 0;
        this.a = bl = Boolean.valueOf((boolean)false);
        this.b = bl;
        this.c = bl;
        this.d = bl;
        this.e = "";
        this.f = "";
        this.g = bl2 = Boolean.valueOf((boolean)true);
        this.h = bl;
        this.i = bl;
        this.j = bl2;
        this.k = n2 = Integer.valueOf((int)8);
        this.l = bl2;
        this.m = bl2;
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = j.c.a();
        this.q = bl;
        this.r = bl;
        this.s = bl;
        this.t = bl2;
        this.u = bl;
        this.v = bl;
        this.w = bl;
        this.x = bl;
        this.y = bl2;
        this.z = 100;
        this.A = bl;
        this.B = bl2;
        this.C = bl;
        this.D = bl;
        this.E = bl2;
        this.F = bl2;
        this.G = bl2;
        this.I = bl2;
        this.J = bl2;
        this.K = bl2;
        this.L = bl2;
        this.N = bl;
        this.O = bl;
        this.P = -1;
        this.Q = "cursive";
        this.R = n3 = Integer.valueOf((int)16);
        this.S = n3;
        this.T = "UTF-8";
        this.V = "fantasy";
        this.W = "monospace";
        this.X = n4;
        this.Y = bl2;
        this.a0 = bl2;
        this.b0 = bl2;
        this.c0 = n2;
        this.d0 = n4;
        this.e0 = bl2;
        this.f0 = bl;
        this.g0 = "sans-serif";
        this.h0 = "sans-serif";
        this.i0 = "sans-serif";
        this.j0 = bl2;
        this.k0 = bl2;
        this.l0 = bl2;
        this.m0 = bl;
        this.o0 = 1;
        this.p0 = null;
        this.q0 = n4;
        this.r0 = n4;
        this.s0 = null;
        this.t0 = bl2;
        this.u0 = null;
        this.v0 = new HashMap();
        this.w0 = bl;
        this.x0 = bl;
        this.y0 = bl;
    }

    private void a(String string2) {
        block8 : {
            block11 : {
                block10 : {
                    block9 : {
                        if (string2 == null) break block8;
                        int n2 = -1;
                        int n3 = string2.hashCode();
                        if (n3 != -1986416409) {
                            if (n3 != 1055046617) {
                                if (n3 == 1561826623 && string2.equals((Object)"TEXT_AUTOSIZING")) {
                                    n2 = 2;
                                }
                            } else if (string2.equals((Object)"NARROW_COLUMNS")) {
                                n2 = 0;
                            }
                        } else if (string2.equals((Object)"NORMAL")) {
                            n2 = 1;
                        }
                        if (n2 == 0) break block9;
                        if (n2 == 1) break block10;
                        if (n2 != 2) {
                            return;
                        }
                        break block11;
                    }
                    this.Z = WebSettings.LayoutAlgorithm.NARROW_COLUMNS;
                }
                this.Z = WebSettings.LayoutAlgorithm.NORMAL;
            }
            WebSettings.LayoutAlgorithm layoutAlgorithm = Build.VERSION.SDK_INT >= 19 ? WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING : WebSettings.LayoutAlgorithm.NORMAL;
            this.Z = layoutAlgorithm;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String b() {
        WebSettings.LayoutAlgorithm layoutAlgorithm = this.Z;
        if (layoutAlgorithm == null) return null;
        int n2 = a.a[layoutAlgorithm.ordinal()];
        if (n2 == 1) return "NORMAL";
        if (n2 != 2) {
            if (n2 != 3) return null;
            return "NARROW_COLUMNS";
        }
        if (Build.VERSION.SDK_INT < 19) return "NORMAL";
        return "TEXT_AUTOSIZING";
    }

    public g a(Map<String, Object> map) {
        block158 : for (Map.Entry entry : map.entrySet()) {
            String string2 = (String)entry.getKey();
            Object object = entry.getValue();
            if (object == null) continue;
            int n2 = -1;
            switch (string2.hashCode()) {
                default: {
                    break;
                }
                case 2038327673: {
                    if (!string2.equals((Object)"clearSessionCache")) break;
                    n2 = 25;
                    break;
                }
                case 2011947505: {
                    if (!string2.equals((Object)"verticalScrollBarEnabled")) break;
                    n2 = 11;
                    break;
                }
                case 1956631083: {
                    if (!string2.equals((Object)"minimumLogicalFontSize")) break;
                    n2 = 54;
                    break;
                }
                case 1812525393: {
                    if (!string2.equals((Object)"thirdPartyCookiesEnabled")) break;
                    n2 = 62;
                    break;
                }
                case 1793491907: {
                    if (!string2.equals((Object)"defaultFixedFontSize")) break;
                    n2 = 43;
                    break;
                }
                case 1774215812: {
                    if (!string2.equals((Object)"supportMultipleWindows")) break;
                    n2 = 64;
                    break;
                }
                case 1759079762: {
                    if (!string2.equals((Object)"contentBlockers")) break;
                    n2 = 14;
                    break;
                }
                case 1583791742: {
                    if (!string2.equals((Object)"disableDefaultErrorPage")) break;
                    n2 = 76;
                    break;
                }
                case 1527546113: {
                    if (!string2.equals((Object)"forceDark")) break;
                    n2 = 49;
                    break;
                }
                case 1496887792: {
                    if (!string2.equals((Object)"serifFontFamily")) break;
                    n2 = 59;
                    break;
                }
                case 1474890029: {
                    if (!string2.equals((Object)"safeBrowsingEnabled")) break;
                    n2 = 32;
                    break;
                }
                case 1409728424: {
                    if (!string2.equals((Object)"loadWithOverviewMode")) break;
                    n2 = 52;
                    break;
                }
                case 1344414299: {
                    if (!string2.equals((Object)"geolocationEnabled")) break;
                    n2 = 50;
                    break;
                }
                case 1320461707: {
                    if (!string2.equals((Object)"displayZoomControls")) break;
                    n2 = 27;
                    break;
                }
                case 1301942064: {
                    if (!string2.equals((Object)"standardFontFamily")) break;
                    n2 = 60;
                    break;
                }
                case 1156608422: {
                    if (!string2.equals((Object)"appCachePath")) break;
                    n2 = 38;
                    break;
                }
                case 1138246185: {
                    if (!string2.equals((Object)"allowFileAccess")) break;
                    n2 = 35;
                    break;
                }
                case 849171798: {
                    if (!string2.equals((Object)"scrollBarFadeDuration")) break;
                    n2 = 72;
                    break;
                }
                case 760962753: {
                    if (!string2.equals((Object)"mixedContentMode")) break;
                    n2 = 33;
                    break;
                }
                case 590869196: {
                    if (!string2.equals((Object)"applicationNameForUserAgent")) break;
                    n2 = 5;
                    break;
                }
                case 408799019: {
                    if (!string2.equals((Object)"saveFormData")) break;
                    n2 = 61;
                    break;
                }
                case 397237599: {
                    if (!string2.equals((Object)"cacheEnabled")) break;
                    n2 = 19;
                    break;
                }
                case 393481210: {
                    if (!string2.equals((Object)"useOnLoadResource")) break;
                    n2 = 1;
                    break;
                }
                case 387230482: {
                    if (!string2.equals((Object)"useOnRenderProcessGone")) break;
                    n2 = 75;
                    break;
                }
                case 311430650: {
                    if (!string2.equals((Object)"userAgent")) break;
                    n2 = 4;
                    break;
                }
                case 298870764: {
                    if (!string2.equals((Object)"blockNetworkLoads")) break;
                    n2 = 40;
                    break;
                }
                case 296040698: {
                    if (!string2.equals((Object)"blockNetworkImage")) break;
                    n2 = 39;
                    break;
                }
                case 273267153: {
                    if (!string2.equals((Object)"mediaPlaybackRequiresUserGesture")) break;
                    n2 = 9;
                    break;
                }
                case 257886264: {
                    if (!string2.equals((Object)"cursiveFontFamily")) break;
                    n2 = 42;
                    break;
                }
                case 174479508: {
                    if (!string2.equals((Object)"useOnDownloadStart")) break;
                    n2 = 2;
                    break;
                }
                case 57717170: {
                    if (!string2.equals((Object)"regexToCancelSubFramesLoading")) break;
                    n2 = 65;
                    break;
                }
                case -98561827: {
                    if (!string2.equals((Object)"sansSerifFontFamily")) break;
                    n2 = 58;
                    break;
                }
                case -158057575: {
                    if (!string2.equals((Object)"rendererPriorityPolicy")) break;
                    n2 = 73;
                    break;
                }
                case -216514471: {
                    if (!string2.equals((Object)"fantasyFontFamily")) break;
                    n2 = 47;
                    break;
                }
                case -225165915: {
                    if (!string2.equals((Object)"offscreenPreRaster")) break;
                    n2 = 57;
                    break;
                }
                case -227577491: {
                    if (!string2.equals((Object)"javaScriptCanOpenWindowsAutomatically")) break;
                    n2 = 8;
                    break;
                }
                case -229178645: {
                    if (!string2.equals((Object)"disableVerticalScroll")) break;
                    n2 = 21;
                    break;
                }
                case -321425255: {
                    if (!string2.equals((Object)"verticalScrollbarPosition")) break;
                    n2 = 69;
                    break;
                }
                case -421090202: {
                    if (!string2.equals((Object)"initialScale")) break;
                    n2 = 55;
                    break;
                }
                case -435719349: {
                    if (!string2.equals((Object)"scrollBarStyle")) break;
                    n2 = 68;
                    break;
                }
                case -443422049: {
                    if (!string2.equals((Object)"horizontalScrollBarEnabled")) break;
                    n2 = 12;
                    break;
                }
                case -553792443: {
                    if (!string2.equals((Object)"cacheMode")) break;
                    n2 = 41;
                    break;
                }
                case -706772569: {
                    if (!string2.equals((Object)"useShouldInterceptRequest")) break;
                    n2 = 74;
                    break;
                }
                case -710246074: {
                    if (!string2.equals((Object)"databaseEnabled")) break;
                    n2 = 29;
                    break;
                }
                case -728016272: {
                    if (!string2.equals((Object)"allowUniversalAccessFromFileURLs")) break;
                    n2 = 37;
                    break;
                }
                case -742944736: {
                    if (!string2.equals((Object)"transparentBackground")) break;
                    n2 = 20;
                    break;
                }
                case -759238347: {
                    if (!string2.equals((Object)"clearCache")) break;
                    n2 = 3;
                    break;
                }
                case -767637403: {
                    if (!string2.equals((Object)"layoutAlgorithm")) break;
                    n2 = 51;
                    break;
                }
                case -800676066: {
                    if (!string2.equals((Object)"minimumFontSize")) break;
                    n2 = 10;
                    break;
                }
                case -1003454816: {
                    if (!string2.equals((Object)"textZoom")) break;
                    n2 = 24;
                    break;
                }
                case -1038715033: {
                    if (!string2.equals((Object)"useShouldInterceptAjaxRequest")) break;
                    n2 = 16;
                    break;
                }
                case -1069908877: {
                    if (!string2.equals((Object)"debuggingEnabled")) break;
                    n2 = 7;
                    break;
                }
                case -1143245914: {
                    if (!string2.equals((Object)"disableContextMenu")) break;
                    n2 = 23;
                    break;
                }
                case -1146673624: {
                    if (!string2.equals((Object)"domStorageEnabled")) break;
                    n2 = 30;
                    break;
                }
                case -1321236988: {
                    if (!string2.equals((Object)"overScrollMode")) break;
                    n2 = 66;
                    break;
                }
                case -1423657812: {
                    if (!string2.equals((Object)"incognito")) break;
                    n2 = 18;
                    break;
                }
                case -1443655540: {
                    if (!string2.equals((Object)"disabledActionModeMenuItems")) break;
                    n2 = 46;
                    break;
                }
                case -1455624881: {
                    if (!string2.equals((Object)"resourceCustomSchemes")) break;
                    n2 = 13;
                    break;
                }
                case -1480607106: {
                    if (!string2.equals((Object)"loadsImagesAutomatically")) break;
                    n2 = 53;
                    break;
                }
                case -1574470051: {
                    if (!string2.equals((Object)"useShouldInterceptFetchRequest")) break;
                    n2 = 17;
                    break;
                }
                case -1578507205: {
                    if (!string2.equals((Object)"networkAvailable")) break;
                    n2 = 67;
                    break;
                }
                case -1578962296: {
                    if (!string2.equals((Object)"hardwareAcceleration")) break;
                    n2 = 63;
                    break;
                }
                case -1607633676: {
                    if (!string2.equals((Object)"javaScriptEnabled")) break;
                    n2 = 6;
                    break;
                }
                case -1615103092: {
                    if (!string2.equals((Object)"builtInZoomControls")) break;
                    n2 = 26;
                    break;
                }
                case -1626497241: {
                    if (!string2.equals((Object)"fixedFontFamily")) break;
                    n2 = 48;
                    break;
                }
                case -1657552268: {
                    if (!string2.equals((Object)"allowContentAccess")) break;
                    n2 = 34;
                    break;
                }
                case -1673892229: {
                    if (!string2.equals((Object)"preferredContentMode")) break;
                    n2 = 15;
                    break;
                }
                case -1712086669: {
                    if (!string2.equals((Object)"useShouldOverrideUrlLoading")) break;
                    n2 = 0;
                    break;
                }
                case -1746033750: {
                    if (!string2.equals((Object)"needInitialFocus")) break;
                    n2 = 56;
                    break;
                }
                case -1834028884: {
                    if (!string2.equals((Object)"defaultTextEncodingName")) break;
                    n2 = 45;
                    break;
                }
                case -1845480382: {
                    if (!string2.equals((Object)"scrollbarFadingEnabled")) break;
                    n2 = 71;
                    break;
                }
                case -1851090878: {
                    if (!string2.equals((Object)"supportZoom")) break;
                    n2 = 28;
                    break;
                }
                case -1931277743: {
                    if (!string2.equals((Object)"defaultFontSize")) break;
                    n2 = 44;
                    break;
                }
                case -2014672109: {
                    if (!string2.equals((Object)"allowFileAccessFromFileURLs")) break;
                    n2 = 36;
                    break;
                }
                case -2020146208: {
                    if (!string2.equals((Object)"useWideViewPort")) break;
                    n2 = 31;
                    break;
                }
                case -2095822429: {
                    if (!string2.equals((Object)"scrollBarDefaultDelayBeforeFade")) break;
                    n2 = 70;
                    break;
                }
                case -2116596967: {
                    if (!string2.equals((Object)"disableHorizontalScroll")) break;
                    n2 = 22;
                }
            }
            switch (n2) {
                default: {
                    continue block158;
                }
                case 76: {
                    this.y0 = (Boolean)object;
                    continue block158;
                }
                case 75: {
                    this.x0 = (Boolean)object;
                    continue block158;
                }
                case 74: {
                    this.w0 = (Boolean)object;
                    continue block158;
                }
                case 73: {
                    this.v0 = (Map)object;
                    continue block158;
                }
                case 72: {
                    this.u0 = (Integer)object;
                    continue block158;
                }
                case 71: {
                    this.t0 = (Boolean)object;
                    continue block158;
                }
                case 70: {
                    this.s0 = (Integer)object;
                    continue block158;
                }
                case 69: {
                    this.r0 = (Integer)object;
                    continue block158;
                }
                case 68: {
                    this.q0 = (Integer)object;
                    continue block158;
                }
                case 67: {
                    this.p0 = (Boolean)object;
                    continue block158;
                }
                case 66: {
                    this.o0 = (Integer)object;
                    continue block158;
                }
                case 65: {
                    this.n0 = (String)object;
                    continue block158;
                }
                case 64: {
                    this.m0 = (Boolean)object;
                    continue block158;
                }
                case 63: {
                    this.l0 = (Boolean)object;
                    continue block158;
                }
                case 62: {
                    this.k0 = (Boolean)object;
                    continue block158;
                }
                case 61: {
                    this.j0 = (Boolean)object;
                    continue block158;
                }
                case 60: {
                    this.i0 = (String)object;
                    continue block158;
                }
                case 59: {
                    this.h0 = (String)object;
                    continue block158;
                }
                case 58: {
                    this.g0 = (String)object;
                    continue block158;
                }
                case 57: {
                    this.f0 = (Boolean)object;
                    continue block158;
                }
                case 56: {
                    this.e0 = (Boolean)object;
                    continue block158;
                }
                case 55: {
                    this.d0 = (Integer)object;
                    continue block158;
                }
                case 54: {
                    this.c0 = (Integer)object;
                    continue block158;
                }
                case 53: {
                    this.b0 = (Boolean)object;
                    continue block158;
                }
                case 52: {
                    this.a0 = (Boolean)object;
                    continue block158;
                }
                case 51: {
                    g.super.a((String)object);
                    continue block158;
                }
                case 50: {
                    this.Y = (Boolean)object;
                    continue block158;
                }
                case 49: {
                    this.X = (Integer)object;
                    continue block158;
                }
                case 48: {
                    this.W = (String)object;
                    continue block158;
                }
                case 47: {
                    this.V = (String)object;
                    continue block158;
                }
                case 46: {
                    this.U = (Integer)object;
                    continue block158;
                }
                case 45: {
                    this.T = (String)object;
                    continue block158;
                }
                case 44: {
                    this.S = (Integer)object;
                    continue block158;
                }
                case 43: {
                    this.R = (Integer)object;
                    continue block158;
                }
                case 42: {
                    this.Q = (String)object;
                    continue block158;
                }
                case 41: {
                    this.P = (Integer)object;
                    continue block158;
                }
                case 40: {
                    this.O = (Boolean)object;
                    continue block158;
                }
                case 39: {
                    this.N = (Boolean)object;
                    continue block158;
                }
                case 38: {
                    this.M = (String)object;
                    continue block158;
                }
                case 37: {
                    this.L = (Boolean)object;
                    continue block158;
                }
                case 36: {
                    this.K = (Boolean)object;
                    continue block158;
                }
                case 35: {
                    this.J = (Boolean)object;
                    continue block158;
                }
                case 34: {
                    this.I = (Boolean)object;
                    continue block158;
                }
                case 33: {
                    this.H = (Integer)object;
                    continue block158;
                }
                case 32: {
                    this.G = (Boolean)object;
                    continue block158;
                }
                case 31: {
                    this.F = (Boolean)object;
                    continue block158;
                }
                case 30: {
                    this.E = (Boolean)object;
                    continue block158;
                }
                case 29: {
                    this.D = (Boolean)object;
                    continue block158;
                }
                case 28: {
                    this.y = (Boolean)object;
                    continue block158;
                }
                case 27: {
                    this.C = (Boolean)object;
                    continue block158;
                }
                case 26: {
                    this.B = (Boolean)object;
                    continue block158;
                }
                case 25: {
                    this.A = (Boolean)object;
                    continue block158;
                }
                case 24: {
                    this.z = (Integer)object;
                    continue block158;
                }
                case 23: {
                    this.x = (Boolean)object;
                    continue block158;
                }
                case 22: {
                    this.w = (Boolean)object;
                    continue block158;
                }
                case 21: {
                    this.v = (Boolean)object;
                    continue block158;
                }
                case 20: {
                    this.u = (Boolean)object;
                    continue block158;
                }
                case 19: {
                    this.t = (Boolean)object;
                    continue block158;
                }
                case 18: {
                    this.s = (Boolean)object;
                    continue block158;
                }
                case 17: {
                    this.r = (Boolean)object;
                    continue block158;
                }
                case 16: {
                    this.q = (Boolean)object;
                    continue block158;
                }
                case 15: {
                    this.p = (Integer)object;
                    continue block158;
                }
                case 14: {
                    this.o = (List)object;
                    continue block158;
                }
                case 13: {
                    this.n = (List)object;
                    continue block158;
                }
                case 12: {
                    this.m = (Boolean)object;
                    continue block158;
                }
                case 11: {
                    this.l = (Boolean)object;
                    continue block158;
                }
                case 10: {
                    this.k = (Integer)object;
                    continue block158;
                }
                case 9: {
                    this.j = (Boolean)object;
                    continue block158;
                }
                case 8: {
                    this.i = (Boolean)object;
                    continue block158;
                }
                case 7: {
                    this.h = (Boolean)object;
                    continue block158;
                }
                case 6: {
                    this.g = (Boolean)object;
                    continue block158;
                }
                case 5: {
                    this.f = (String)object;
                    continue block158;
                }
                case 4: {
                    this.e = (String)object;
                    continue block158;
                }
                case 3: {
                    this.d = (Boolean)object;
                    continue block158;
                }
                case 2: {
                    this.c = (Boolean)object;
                    continue block158;
                }
                case 1: {
                    this.b = (Boolean)object;
                    continue block158;
                }
                case 0: 
            }
            this.a = (Boolean)object;
        }
        return this;
    }

    public Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"useShouldOverrideUrlLoading", (Object)this.a);
        hashMap.put((Object)"useOnLoadResource", (Object)this.b);
        hashMap.put((Object)"useOnDownloadStart", (Object)this.c);
        hashMap.put((Object)"clearCache", (Object)this.d);
        hashMap.put((Object)"userAgent", (Object)this.e);
        hashMap.put((Object)"applicationNameForUserAgent", (Object)this.f);
        hashMap.put((Object)"javaScriptEnabled", (Object)this.g);
        hashMap.put((Object)"debuggingEnabled", (Object)this.h);
        hashMap.put((Object)"javaScriptCanOpenWindowsAutomatically", (Object)this.i);
        hashMap.put((Object)"mediaPlaybackRequiresUserGesture", (Object)this.j);
        hashMap.put((Object)"minimumFontSize", (Object)this.k);
        hashMap.put((Object)"verticalScrollBarEnabled", (Object)this.l);
        hashMap.put((Object)"horizontalScrollBarEnabled", (Object)this.m);
        hashMap.put((Object)"resourceCustomSchemes", this.n);
        hashMap.put((Object)"contentBlockers", this.o);
        hashMap.put((Object)"preferredContentMode", (Object)this.p);
        hashMap.put((Object)"useShouldInterceptAjaxRequest", (Object)this.q);
        hashMap.put((Object)"useShouldInterceptFetchRequest", (Object)this.r);
        hashMap.put((Object)"incognito", (Object)this.s);
        hashMap.put((Object)"cacheEnabled", (Object)this.t);
        hashMap.put((Object)"transparentBackground", (Object)this.u);
        hashMap.put((Object)"disableVerticalScroll", (Object)this.v);
        hashMap.put((Object)"disableHorizontalScroll", (Object)this.w);
        hashMap.put((Object)"disableContextMenu", (Object)this.x);
        hashMap.put((Object)"textZoom", (Object)this.z);
        hashMap.put((Object)"clearSessionCache", (Object)this.A);
        hashMap.put((Object)"builtInZoomControls", (Object)this.B);
        hashMap.put((Object)"displayZoomControls", (Object)this.C);
        hashMap.put((Object)"supportZoom", (Object)this.y);
        hashMap.put((Object)"databaseEnabled", (Object)this.D);
        hashMap.put((Object)"domStorageEnabled", (Object)this.E);
        hashMap.put((Object)"useWideViewPort", (Object)this.F);
        hashMap.put((Object)"safeBrowsingEnabled", (Object)this.G);
        hashMap.put((Object)"mixedContentMode", (Object)this.H);
        hashMap.put((Object)"allowContentAccess", (Object)this.I);
        hashMap.put((Object)"allowFileAccess", (Object)this.J);
        hashMap.put((Object)"allowFileAccessFromFileURLs", (Object)this.K);
        hashMap.put((Object)"allowUniversalAccessFromFileURLs", (Object)this.L);
        hashMap.put((Object)"appCachePath", (Object)this.M);
        hashMap.put((Object)"blockNetworkImage", (Object)this.N);
        hashMap.put((Object)"blockNetworkLoads", (Object)this.O);
        hashMap.put((Object)"cacheMode", (Object)this.P);
        hashMap.put((Object)"cursiveFontFamily", (Object)this.Q);
        hashMap.put((Object)"defaultFixedFontSize", (Object)this.R);
        hashMap.put((Object)"defaultFontSize", (Object)this.S);
        hashMap.put((Object)"defaultTextEncodingName", (Object)this.T);
        hashMap.put((Object)"disabledActionModeMenuItems", (Object)this.U);
        hashMap.put((Object)"fantasyFontFamily", (Object)this.V);
        hashMap.put((Object)"fixedFontFamily", (Object)this.W);
        hashMap.put((Object)"forceDark", (Object)this.X);
        hashMap.put((Object)"geolocationEnabled", (Object)this.Y);
        hashMap.put((Object)"layoutAlgorithm", (Object)this.b());
        hashMap.put((Object)"loadWithOverviewMode", (Object)this.a0);
        hashMap.put((Object)"loadsImagesAutomatically", (Object)this.b0);
        hashMap.put((Object)"minimumLogicalFontSize", (Object)this.c0);
        hashMap.put((Object)"initialScale", (Object)this.d0);
        hashMap.put((Object)"needInitialFocus", (Object)this.e0);
        hashMap.put((Object)"offscreenPreRaster", (Object)this.f0);
        hashMap.put((Object)"sansSerifFontFamily", (Object)this.g0);
        hashMap.put((Object)"serifFontFamily", (Object)this.h0);
        hashMap.put((Object)"standardFontFamily", (Object)this.i0);
        hashMap.put((Object)"saveFormData", (Object)this.j0);
        hashMap.put((Object)"thirdPartyCookiesEnabled", (Object)this.k0);
        hashMap.put((Object)"hardwareAcceleration", (Object)this.l0);
        hashMap.put((Object)"supportMultipleWindows", (Object)this.m0);
        hashMap.put((Object)"regexToCancelSubFramesLoading", (Object)this.n0);
        hashMap.put((Object)"overScrollMode", (Object)this.o0);
        hashMap.put((Object)"networkAvailable", (Object)this.p0);
        hashMap.put((Object)"scrollBarStyle", (Object)this.q0);
        hashMap.put((Object)"verticalScrollbarPosition", (Object)this.r0);
        hashMap.put((Object)"scrollBarDefaultDelayBeforeFade", (Object)this.s0);
        hashMap.put((Object)"scrollbarFadingEnabled", (Object)this.t0);
        hashMap.put((Object)"scrollBarFadeDuration", (Object)this.u0);
        hashMap.put((Object)"rendererPriorityPolicy", this.v0);
        hashMap.put((Object)"useShouldInterceptRequest", (Object)this.w0);
        hashMap.put((Object)"useOnRenderProcessGone", (Object)this.x0);
        hashMap.put((Object)"disableDefaultErrorPage", (Object)this.y0);
        return hashMap;
    }

    public Map<String, Object> a(InAppWebView inAppWebView) {
        Map<String, Object> map = this.a();
        if (inAppWebView != null) {
            WebSettings webSettings = inAppWebView.getSettings();
            map.put((Object)"userAgent", (Object)webSettings.getUserAgentString());
            map.put((Object)"javaScriptEnabled", (Object)webSettings.getJavaScriptEnabled());
            map.put((Object)"javaScriptCanOpenWindowsAutomatically", (Object)webSettings.getJavaScriptCanOpenWindowsAutomatically());
            map.put((Object)"mediaPlaybackRequiresUserGesture", (Object)webSettings.getMediaPlaybackRequiresUserGesture());
            map.put((Object)"minimumFontSize", (Object)webSettings.getMinimumFontSize());
            map.put((Object)"verticalScrollBarEnabled", (Object)inAppWebView.isVerticalScrollBarEnabled());
            map.put((Object)"horizontalScrollBarEnabled", (Object)inAppWebView.isHorizontalScrollBarEnabled());
            map.put((Object)"textZoom", (Object)webSettings.getTextZoom());
            map.put((Object)"builtInZoomControls", (Object)webSettings.getBuiltInZoomControls());
            map.put((Object)"supportZoom", (Object)webSettings.supportZoom());
            map.put((Object)"displayZoomControls", (Object)webSettings.getDisplayZoomControls());
            map.put((Object)"databaseEnabled", (Object)webSettings.getDatabaseEnabled());
            map.put((Object)"domStorageEnabled", (Object)webSettings.getDomStorageEnabled());
            map.put((Object)"useWideViewPort", (Object)webSettings.getUseWideViewPort());
            if (Build.VERSION.SDK_INT >= 26) {
                map.put((Object)"safeBrowsingEnabled", (Object)webSettings.getSafeBrowsingEnabled());
            }
            if (Build.VERSION.SDK_INT >= 21) {
                map.put((Object)"mixedContentMode", (Object)webSettings.getMixedContentMode());
            }
            map.put((Object)"allowContentAccess", (Object)webSettings.getAllowContentAccess());
            map.put((Object)"allowFileAccess", (Object)webSettings.getAllowFileAccess());
            map.put((Object)"allowFileAccessFromFileURLs", (Object)webSettings.getAllowFileAccessFromFileURLs());
            map.put((Object)"allowUniversalAccessFromFileURLs", (Object)webSettings.getAllowUniversalAccessFromFileURLs());
            map.put((Object)"blockNetworkImage", (Object)webSettings.getBlockNetworkImage());
            map.put((Object)"blockNetworkLoads", (Object)webSettings.getBlockNetworkLoads());
            map.put((Object)"cacheMode", (Object)webSettings.getCacheMode());
            map.put((Object)"cursiveFontFamily", (Object)webSettings.getCursiveFontFamily());
            map.put((Object)"defaultFixedFontSize", (Object)webSettings.getDefaultFixedFontSize());
            map.put((Object)"defaultFontSize", (Object)webSettings.getDefaultFontSize());
            map.put((Object)"defaultTextEncodingName", (Object)webSettings.getDefaultTextEncodingName());
            if (Build.VERSION.SDK_INT >= 24) {
                map.put((Object)"disabledActionModeMenuItems", (Object)webSettings.getDisabledActionModeMenuItems());
            }
            map.put((Object)"fantasyFontFamily", (Object)webSettings.getFantasyFontFamily());
            map.put((Object)"fixedFontFamily", (Object)webSettings.getFixedFontFamily());
            if (Build.VERSION.SDK_INT >= 29) {
                map.put((Object)"forceDark", (Object)webSettings.getForceDark());
            }
            map.put((Object)"layoutAlgorithm", (Object)webSettings.getLayoutAlgorithm().name());
            map.put((Object)"loadWithOverviewMode", (Object)webSettings.getLoadWithOverviewMode());
            map.put((Object)"loadsImagesAutomatically", (Object)webSettings.getLoadsImagesAutomatically());
            map.put((Object)"minimumLogicalFontSize", (Object)webSettings.getMinimumLogicalFontSize());
            if (Build.VERSION.SDK_INT >= 23) {
                map.put((Object)"offscreenPreRaster", (Object)webSettings.getOffscreenPreRaster());
            }
            map.put((Object)"sansSerifFontFamily", (Object)webSettings.getSansSerifFontFamily());
            map.put((Object)"serifFontFamily", (Object)webSettings.getSerifFontFamily());
            map.put((Object)"standardFontFamily", (Object)webSettings.getStandardFontFamily());
            map.put((Object)"saveFormData", (Object)webSettings.getSaveFormData());
            map.put((Object)"supportMultipleWindows", (Object)webSettings.supportMultipleWindows());
            map.put((Object)"overScrollMode", (Object)inAppWebView.getOverScrollMode());
            map.put((Object)"scrollBarStyle", (Object)inAppWebView.getScrollBarStyle());
            map.put((Object)"verticalScrollbarPosition", (Object)inAppWebView.getVerticalScrollbarPosition());
            map.put((Object)"scrollBarDefaultDelayBeforeFade", (Object)inAppWebView.getScrollBarDefaultDelayBeforeFade());
            map.put((Object)"scrollbarFadingEnabled", (Object)inAppWebView.isScrollbarFadingEnabled());
            map.put((Object)"scrollBarFadeDuration", (Object)inAppWebView.getScrollBarFadeDuration());
            if (Build.VERSION.SDK_INT >= 26) {
                HashMap hashMap = new HashMap();
                hashMap.put((Object)"rendererRequestedPriority", (Object)inAppWebView.getRendererRequestedPriority());
                hashMap.put((Object)"waivedWhenNotVisible", (Object)inAppWebView.getRendererPriorityWaivedWhenNotVisible());
                map.put((Object)"rendererPriorityPolicy", (Object)hashMap);
            }
        }
        return map;
    }
}

