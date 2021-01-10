/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 */
package f.f.a.f.b;

import android.content.Context;
import android.text.TextUtils;
import f.f.a.e.b.c.e;
import f.f.a.e.b.h.g;
import f.f.a.e.f.f;
import f.f.a.e.f.h;
import f.f.a.f.a$b;
import f.f.a.f.b.a;
import f.f.a.f.c;
import java.io.File;

public class a {
    private static final String b = "(function(){var isIOS=(/iphone|ipad|ipod/i).test(window.navigator.userAgent.toLowerCase());if(isIOS){console={};console.log=function(log){var iframe=document.createElement(\"iframe\");iframe.setAttribute(\"src\",\"ios-log: \"+log);document.documentElement.appendChild(iframe);iframe.parentNode.removeChild(iframe);iframe=null};console.debug=console.info=console.warn=console.error=console.log}}());(function(){var mraid=window.mraid={};var ua=window.navigator.userAgent;var isIOS=(/iPhone|iPad|iPod/i).test(ua);var isAndroid=(/Android/i).test(ua);var bridge=window.mraidbridge={nativeSDKFiredReady:false,nativeCallQueue:[],nativeCallInFlight:false,lastSizeChangeProperties:null};bridge.fireChangeEvent=function(properties){for(var p in properties){if(properties.hasOwnProperty(p)){var handler=changeHandlers[p];handler(properties[p])}}};bridge.nativeCallComplete=function(command){if(this.nativeCallQueue.length===0){this.nativeCallInFlight=false;return}var nextCall=this.nativeCallQueue.pop();callMethod(nextCall)};bridge.executeNativeCall=function(args){var command=args.shift();if(!this.nativeSDKFiredReady){console.log(\"rejecting \"+command+\" because mraid is not ready\");bridge.notifyErrorEvent(\"mraid is not ready\",command);return}var call=\"mraid://\"+command;var key,value;var isFirstArgument=true;for(var i=0;i<args.length;i+=2){key=args[i];value=args[i+1];if(value===null){continue}if(isFirstArgument){call+=\"?\";isFirstArgument=false}else{call+=\"&\"}call+=encodeURIComponent(key)+\"=\"+encodeURIComponent(value)}if(this.nativeCallInFlight){this.nativeCallQueue.push(call)}else{this.nativeCallInFlight=true;callMethod(call)}};function useIframe(url){var iframe=document.createElement(\"iframe\");iframe.setAttribute(\"frameborder\",\"0\");iframe.style.cssText=\"width:0;height:0;border:0;display:none;\";iframe.setAttribute(\"src\",url);setTimeout(function(){document.body.appendChild(iframe)},5)}function callMethod(call){broadcastEvent(EVENTS.INFO,\"\u8c03\u7528\u65b9\u6cd5:\"+call);if(isIOS){useIframe(call)}else{if(isAndroid){window.prompt(call,\"mraid:\")}}}bridge.setCurrentPosition=function(x,y,width,height){currentPosition={x:x,y:y,width:width,height:height};broadcastEvent(EVENTS.INFO,\"Set current position to \"+stringify(currentPosition))};bridge.setDefaultPosition=function(x,y,width,height){defaultPosition={x:x,y:y,width:width,height:height};broadcastEvent(EVENTS.INFO,\"Set default position to \"+stringify(defaultPosition))};bridge.setMaxSize=function(width,height){maxSize={width:width,height:height};expandProperties.width=width;expandProperties.height=height;broadcastEvent(EVENTS.INFO,\"Set max size to \"+stringify(maxSize))};bridge.setPlacementType=function(_placementType){placementType=_placementType;broadcastEvent(EVENTS.INFO,\"Set placement type to \"+stringify(placementType))};bridge.setScreenSize=function(width,height){screenSize={width:width,height:height};broadcastEvent(EVENTS.INFO,\"Set screen size to \"+stringify(screenSize))};bridge.setState=function(_state){state=_state;broadcastEvent(EVENTS.INFO,\"Set state to \"+stringify(state));broadcastEvent(EVENTS.STATECHANGE,state)};bridge.setIsViewable=function(_isViewable){isViewable=_isViewable;broadcastEvent(EVENTS.INFO,\"Set isViewable to \"+stringify(isViewable));broadcastEvent(EVENTS.VIEWABLECHANGE,isViewable)};bridge.setSupports=function(sms,tel,calendar,storePicture,inlineVideo){supportProperties={sms:sms,tel:tel,calendar:calendar,storePicture:storePicture,inlineVideo:inlineVideo}};bridge.notifyReadyEvent=function(){this.nativeSDKFiredReady=true;broadcastEvent(EVENTS.READY)};bridge.notifyErrorEvent=function(message,action){broadcastEvent(EVENTS.ERROR,message,action)};bridge.fireReadyEvent=bridge.notifyReadyEvent;bridge.fireErrorEvent=bridge.notifyErrorEvent;bridge.notifySizeChangeEvent=function(width,height){if(this.lastSizeChangeProperties&&width==this.lastSizeChangeProperties.width&&height==this.lastSizeChangeProperties.height){return}this.lastSizeChangeProperties={width:width,height:height};broadcastEvent(EVENTS.SIZECHANGE,width,height)};bridge.notifyStateChangeEvent=function(){if(state===STATES.LOADING){broadcastEvent(EVENTS.INFO,\"Native SDK initialized.\")}broadcastEvent(EVENTS.INFO,\"Set state to \"+stringify(state));broadcastEvent(EVENTS.STATECHANGE,state)};bridge.notifyViewableChangeEvent=function(){broadcastEvent(EVENTS.INFO,\"Set isViewable to \"+stringify(isViewable));broadcastEvent(EVENTS.VIEWABLECHANGE,isViewable)};bridge.audioVolumeChange=function(val){currentVolumePercentage=val;broadcastEvent(EVENTS.INFO,\"Set audioVolumeChange to \"+stringify(val));broadcastEvent(EVENTS.AUDIOVOLUMECHANGE,currentVolumePercentage)};var VERSION=mraid.VERSION=\"3.0\";var STATES=mraid.STATES={LOADING:\"loading\",DEFAULT:\"default\",EXPANDED:\"expanded\",HIDDEN:\"hidden\",RESIZED:\"resized\"};var EVENTS=mraid.EVENTS={ERROR:\"error\",INFO:\"info\",READY:\"ready\",STATECHANGE:\"stateChange\",VIEWABLECHANGE:\"viewableChange\",SIZECHANGE:\"sizeChange\",AUDIOVOLUMECHANGE:\"audioVolumeChange\"};var PLACEMENT_TYPES=mraid.PLACEMENT_TYPES={UNKNOWN:\"unknown\",INLINE:\"inline\",INTERSTITIAL:\"interstitial\"};var expandProperties={width:false,height:false,useCustomClose:false,isModal:true};var resizeProperties={width:false,height:false,offsetX:false,offsetY:false,customClosePosition:\"top-right\",allowOffscreen:true};var orientationProperties={allowOrientationChange:true,forceOrientation:\"none\"};var supportProperties={sms:false,tel:false,calendar:false,storePicture:false,inlineVideo:false};var lastSizeChangeProperties;var maxSize={};var currentPosition={};var defaultPosition={};var screenSize={};var hasSetCustomClose=false;var listeners={};var appOrientation={};var currentVolumePercentage=\"\";var state=STATES.LOADING;var isViewable=false;var placementType=PLACEMENT_TYPES.UNKNOWN;var hostSDKVersion={\"major\":0,\"minor\":0,\"patch\":0};var EventListeners=function(event){this.event=event;this.count=0;var listeners={};this.add=function(func){var id=String(func);if(!listeners[id]){listeners[id]=func;this.count++}};this.remove=function(func){var id=String(func);if(listeners[id]){listeners[id]=null;delete listeners[id];this.count--;return true}else{return false}};this.removeAll=function(){for(var id in listeners){if(listeners.hasOwnProperty(id)){this.remove(listeners[id])}}};this.broadcast=function(args){for(var id in listeners){if(listeners.hasOwnProperty(id)){listeners[id].apply(mraid,args)}}};this.toString=function(){var out=[event,\":\"];for(var id in listeners){if(listeners.hasOwnProperty(id)){out.push(\"|\",id,\"|\")}}return out.join(\"\")}};var broadcastEvent=function(){var args=new Array(arguments.length);var l=arguments.length;for(var i=0;i<l;i++){args[i]=arguments[i]}var event=args.shift();if(listeners[event]){listeners[event].broadcast(args)}};var contains=function(value,array){for(var i in array){if(array[i]===value){return true}}return false};var clone=function(obj){if(obj===null){return null}var f=function(){};f.prototype=obj;return new f()};var stringify=function(obj){if(typeof obj===\"object\"){var out=[];if(obj.push){for(var p in obj){out.push(obj[p])}return\"[\"+out.join(\",\")+\"]\"}else{for(var p in obj){out.push(\"'\"+p+\"': \"+obj[p])}return\"{\"+out.join(\",\")+\"}\"}}else{return String(obj)}};var trim=function(str){return str.replace(/^\\s+|\\s+$/g,\"\")};var changeHandlers={state:function(val){if(state===STATES.LOADING){broadcastEvent(EVENTS.INFO,\"Native SDK initialized.\")}state=val;broadcastEvent(EVENTS.INFO,\"Set state to \"+stringify(val));broadcastEvent(EVENTS.STATECHANGE,state)},viewable:function(val){isViewable=val;broadcastEvent(EVENTS.INFO,\"Set isViewable to \"+stringify(val));broadcastEvent(EVENTS.VIEWABLECHANGE,isViewable)},placementType:function(val){broadcastEvent(EVENTS.INFO,\"Set placementType to \"+stringify(val));placementType=val},sizeChange:function(val){broadcastEvent(EVENTS.INFO,\"Set screenSize to \"+stringify(val));for(var key in val){if(val.hasOwnProperty(key)){screenSize[key]=val[key]}}},currentAppOrientation:function(orientation,locked){appOrientation={orientation:orientation,locked:locked};broadcastEvent(EVENTS.INFO,\"Set app orientation to \"+stringify(appOrientation))},supports:function(val){broadcastEvent(EVENTS.INFO,\"Set supports to \"+stringify(val));supportProperties=val},hostSDKVersion:function(val){var versions=val.split(\".\").map(function(version){return parseInt(version,10)}).filter(function(version){return version>=0});if(versions.length>=3){hostSDKVersion[\"major\"]=parseInt(versions[0],10);hostSDKVersion[\"minor\"]=parseInt(versions[1],10);hostSDKVersion[\"patch\"]=parseInt(versions[2],10);broadcastEvent(EVENTS.INFO,\"Set hostSDKVersion to \"+stringify(hostSDKVersion))}}};var validate=function(obj,validators,action,merge){if(!merge){if(obj===null){broadcastEvent(EVENTS.ERROR,\"Required object not provided.\",action);return false}else{for(var i in validators){if(validators.hasOwnProperty(i)&&obj[i]===undefined){broadcastEvent(EVENTS.ERROR,\"Object is missing required property: \"+i,action);return false}}}}for(var prop in obj){var validator=validators[prop];var value=obj[prop];if(validator&&!validator(value)){broadcastEvent(EVENTS.ERROR,\"Value of property \"+prop+\" is invalid: \"+value,action);return false}}return true};var expandPropertyValidators={useCustomClose:function(v){return(typeof v===\"boolean\")},};mraid.addEventListener=function(event,listener){if(!event||!listener){broadcastEvent(EVENTS.ERROR,\"Both event and listener are required.\",\"addEventListener\")}else{if(!contains(event,EVENTS)){broadcastEvent(EVENTS.ERROR,\"Unknown MRAID event: \"+event,\"addEventListener\")}else{if(!listeners[event]){listeners[event]=new EventListeners(event)}listeners[event].add(listener)}}};mraid.close=function(){if(state===STATES.HIDDEN){broadcastEvent(EVENTS.ERROR,\"Ad cannot be closed when it is already hidden.\",\"close\")}else{bridge.executeNativeCall([\"close\"])}};mraid.unload=function(){if(state===STATES.EXPANDED){broadcastEvent(EVENTS.ERROR,\"Ad cannot be unload when it is already EXPANDED.\",\"close\")}else{bridge.executeNativeCall([\"unload\"])}};mraid.expand=function(URL){if(!(this.getState()===STATES.DEFAULT||this.getState()===STATES.RESIZED)){broadcastEvent(EVENTS.ERROR,\"Ad can only be expanded from the default or resized state.\",\"expand\")}else{var args=[\"expand\",\"shouldUseCustomClose\",expandProperties.useCustomClose];if(URL){args=args.concat([\"url\",URL])}bridge.executeNativeCall(args)}};mraid.getExpandProperties=function(){var properties={width:expandProperties.width,height:expandProperties.height,useCustomClose:expandProperties.useCustomClose,isModal:expandProperties.isModal};return properties};mraid.getCurrentPosition=function(){return{x:currentPosition.x,y:currentPosition.y,width:currentPosition.width,height:currentPosition.height}};mraid.getDefaultPosition=function(){return{x:defaultPosition.x,y:defaultPosition.y,width:defaultPosition.width,height:defaultPosition.height}};mraid.getMaxSize=function(){return{width:maxSize.width,height:maxSize.height}};mraid.getPlacementType=function(){return placementType};mraid.getScreenSize=function(){return{width:screenSize.width,height:screenSize.height}};mraid.getState=function(){return state};mraid.isViewable=function(){return isViewable};mraid.getVersion=function(){return mraid.VERSION};mraid.getCurrentAppOrientation=function(){return{orientation:appOrientation.orientation,locked:appOrientation.locked}};mraid.getAudioVolume=function(){return currentVolumePercentage};mraid.open=function(URL){if(!URL){broadcastEvent(EVENTS.ERROR,\"URL is required.\",\"open\")}else{bridge.executeNativeCall([\"open\",\"url\",URL])}};mraid.removeEventListener=function(event,listener){if(!event){broadcastEvent(EVENTS.ERROR,\"Event is required.\",\"removeEventListener\");return}if(listener){var success=false;if(listeners[event]){success=listeners[event].remove(listener)}if(!success){broadcastEvent(EVENTS.ERROR,\"Listener not currently registered for event.\",\"removeEventListener\");return}}else{if(!listener&&listeners[event]){listeners[event].removeAll()}}if(listeners[event]&&listeners[event].count===0){listeners[event]=null;delete listeners[event]}};mraid.setExpandProperties=function(properties){if(validate(properties,expandPropertyValidators,\"setExpandProperties\",true)){if(properties.hasOwnProperty(\"useCustomClose\")){expandProperties.useCustomClose=properties.useCustomClose}}};mraid.useCustomClose=function(shouldUseCustomClose){expandProperties.useCustomClose=shouldUseCustomClose;hasSetCustomClose=true;bridge.executeNativeCall([\"useCustomClose\",\"shouldUseCustomClose\",shouldUseCustomClose])};mraid.createCalendarEvent=function(parameters){CalendarEventParser.initialize(parameters);if(CalendarEventParser.parse()){bridge.executeNativeCall(CalendarEventParser.arguments)}else{broadcastEvent(EVENTS.ERROR,CalendarEventParser.errors[0],\"createCalendarEvent\")}};mraid.supports=function(feature){return supportProperties[feature]};mraid.playVideo=function(uri){if(!mraid.isViewable()){broadcastEvent(EVENTS.ERROR,\"playVideo cannot be called until the ad is viewable\",\"playVideo\");return}if(!uri){broadcastEvent(EVENTS.ERROR,\"playVideo must be called with a valid URI\",\"playVideo\")}else{bridge.executeNativeCall([\"playVideo\",\"uri\",uri])}};mraid.storePicture=function(uri){if(!mraid.isViewable()){broadcastEvent(EVENTS.ERROR,\"storePicture cannot be called until the ad is viewable\",\"storePicture\");return}if(!uri){broadcastEvent(EVENTS.ERROR,\"storePicture must be called with a valid URI\",\"storePicture\")}else{bridge.executeNativeCall([\"storePicture\",\"uri\",uri])}};var resizePropertyValidators={width:function(v){return !isNaN(v)&&v>0},height:function(v){return !isNaN(v)&&v>0},offsetX:function(v){return !isNaN(v)},offsetY:function(v){return !isNaN(v)},customClosePosition:function(v){return(typeof v===\"string\"&&[\"top-right\",\"bottom-right\",\"top-left\",\"bottom-left\",\"center\",\"top-center\",\"bottom-center\"].indexOf(v)>-1)},allowOffscreen:function(v){return(typeof v===\"boolean\")}};mraid.setOrientationProperties=function(properties){if(properties.hasOwnProperty(\"allowOrientationChange\")){orientationProperties.allowOrientationChange=properties.allowOrientationChange}if(properties.hasOwnProperty(\"forceOrientation\")){orientationProperties.forceOrientation=properties.forceOrientation}var args=[\"setOrientationProperties\",\"allowOrientationChange\",orientationProperties.allowOrientationChange,\"forceOrientation\",orientationProperties.forceOrientation];bridge.executeNativeCall(args)};mraid.getOrientationProperties=function(){return{allowOrientationChange:orientationProperties.allowOrientationChange,forceOrientation:orientationProperties.forceOrientation}};mraid.resize=function(){if(!(this.getState()===STATES.DEFAULT||this.getState()===STATES.RESIZED)){broadcastEvent(EVENTS.ERROR,\"Ad can only be resized from the default or resized state.\",\"resize\")}else{if(!resizeProperties.width||!resizeProperties.height){broadcastEvent(EVENTS.ERROR,\"Must set resize properties before calling resize()\",\"resize\")}else{var args=[\"resize\",\"width\",resizeProperties.width,\"height\",resizeProperties.height,\"offsetX\",resizeProperties.offsetX||0,\"offsetY\",resizeProperties.offsetY||0,\"customClosePosition\",resizeProperties.customClosePosition,\"allowOffscreen\",!!resizeProperties.allowOffscreen];bridge.executeNativeCall(args)}}};mraid.getResizeProperties=function(){var properties={width:resizeProperties.width,height:resizeProperties.height,offsetX:resizeProperties.offsetX,offsetY:resizeProperties.offsetY,customClosePosition:resizeProperties.customClosePosition,allowOffscreen:resizeProperties.allowOffscreen};return properties};mraid.setResizeProperties=function(properties){if(validate(properties,resizePropertyValidators,\"setResizeProperties\",true)){var desiredProperties=[\"width\",\"height\",\"offsetX\",\"offsetY\",\"customClosePosition\",\"allowOffscreen\"];var length=desiredProperties.length;for(var i=0;i<length;i++){var propname=desiredProperties[i];if(properties.hasOwnProperty(propname)){resizeProperties[propname]=properties[propname]}}}};mraid.getHostSDKVersion=function(){return hostSDKVersion};var CalendarEventParser={initialize:function(parameters){this.parameters=parameters;this.errors=[];this.arguments=[\"createCalendarEvent\"]},parse:function(){if(!this.parameters){this.errors.push(\"The object passed to createCalendarEvent cannot be null.\")}else{this.parseDescription();this.parseLocation();this.parseSummary();this.parseStartAndEndDates();this.parseReminder();this.parseRecurrence();this.parseTransparency()}var errorCount=this.errors.length;if(errorCount){this.arguments.length=0}return(errorCount===0)},parseDescription:function(){this._processStringValue(\"description\")},parseLocation:function(){this._processStringValue(\"location\")},parseSummary:function(){this._processStringValue(\"summary\")},parseStartAndEndDates:function(){this._processDateValue(\"start\");this._processDateValue(\"end\")},parseReminder:function(){var reminder=this._getParameter(\"reminder\");if(!reminder){return}if(reminder<0){this.arguments.push(\"relativeReminder\");this.arguments.push(parseInt(reminder)/1000)}else{this.arguments.push(\"absoluteReminder\");this.arguments.push(reminder)}},parseRecurrence:function(){var recurrenceDict=this._getParameter(\"recurrence\");if(!recurrenceDict){return}this.parseRecurrenceInterval(recurrenceDict);this.parseRecurrenceFrequency(recurrenceDict);this.parseRecurrenceEndDate(recurrenceDict);this.parseRecurrenceArrayValue(recurrenceDict,\"daysInWeek\");this.parseRecurrenceArrayValue(recurrenceDict,\"daysInMonth\");this.parseRecurrenceArrayValue(recurrenceDict,\"daysInYear\");this.parseRecurrenceArrayValue(recurrenceDict,\"monthsInYear\")},parseTransparency:function(){var validValues=[\"opaque\",\"transparent\"];if(this.parameters.hasOwnProperty(\"transparency\")){var transparency=this.parameters.transparency;if(contains(transparency,validValues)){this.arguments.push(\"transparency\");this.arguments.push(transparency)}else{this.errors.push(\"transparency must be opaque or transparent\")}}},parseRecurrenceArrayValue:function(recurrenceDict,kind){if(recurrenceDict.hasOwnProperty(kind)){var array=recurrenceDict[kind];if(!array||!(array instanceof Array)){this.errors.push(kind+\" must be an array.\")}else{var arrayStr=array.join(\",\");this.arguments.push(kind);this.arguments.push(arrayStr)}}},parseRecurrenceInterval:function(recurrenceDict){if(recurrenceDict.hasOwnProperty(\"interval\")){var interval=recurrenceDict.interval;if(!interval){this.errors.push(\"Recurrence interval cannot be null.\")}else{this.arguments.push(\"interval\");this.arguments.push(interval)}}else{this.arguments.push(\"interval\");this.arguments.push(1)}},parseRecurrenceFrequency:function(recurrenceDict){if(recurrenceDict.hasOwnProperty(\"frequency\")){var frequency=recurrenceDict.frequency;var validFrequencies=[\"daily\",\"weekly\",\"monthly\",\"yearly\"];if(contains(frequency,validFrequencies)){this.arguments.push(\"frequency\");this.arguments.push(frequency)}else{this.errors.push('Recurrence frequency must be one of: \"daily\", \"weekly\", \"monthly\", \"yearly\".')}}},parseRecurrenceEndDate:function(recurrenceDict){var expires=recurrenceDict.expires;if(!expires){return}this.arguments.push(\"expires\");this.arguments.push(expires)},_getParameter:function(key){if(this.parameters.hasOwnProperty(key)){return this.parameters[key]}return null},_processStringValue:function(kind){if(this.parameters.hasOwnProperty(kind)){var value=this.parameters[kind];this.arguments.push(kind);this.arguments.push(value)}},_processDateValue:function(kind){if(this.parameters.hasOwnProperty(kind)){var dateString=this._getParameter(kind);this.arguments.push(kind);this.arguments.push(dateString)}}}}());".replaceAll("(?m)^\\s+", "").replaceAll("(?m)^//.*(?=\\n)", "");
    private static volatile a c;
    private String a;

    private a() {
    }

    static /* synthetic */ String a(a a2, String string) {
        a2.a = string;
        return string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a b() {
        if (c != null) return c;
        Class<a> class_ = a.class;
        synchronized (a.class) {
            if (c != null) return c;
            c = new a();
            // ** MonitorExit[var1] (shouldn't be in output)
            return c;
        }
    }

    static /* synthetic */ void b(a a2, final String string) {
        new Thread(new Runnable(a2){

            public final void run() {
                try {
                    File file = new File(e.b(f.f.a.e.b.c.c.k), "mraid_js.txt");
                    if (file.exists()) {
                        file.delete();
                    }
                    f.a(string.getBytes(), file);
                    return;
                }
                catch (Exception exception) {
                    h.a("MraidJSController", exception.getMessage());
                    return;
                }
            }
        }).start();
    }

    private String c() {
        try {
            File file = new File(e.b(f.f.a.e.b.c.c.k), "mraid_js.txt");
            if (file.exists() && file.canRead()) {
                String string = f.a(file);
                return string;
            }
        }
        catch (Exception exception) {
            h.a("MraidJSController", exception.getMessage());
        }
        return "";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String a() {
        f.f.a.f.a a2;
        try {
            if (TextUtils.isEmpty((CharSequence)this.a)) {
                this.a = this.c();
            }
            if (!TextUtils.isEmpty((CharSequence)this.a)) return this.a;
            a2 = c.b().a(f.f.a.e.c.a.i().f());
            if (a2 == null) return b;
        }
        catch (Exception exception) {
            return b;
        }
        if (TextUtils.isEmpty((CharSequence)a2.x())) return b;
        this.a(f.f.a.e.c.a.i().e(), a2.x());
        return b;
    }

    public final void a(Context context, String string) {
        if (context == null) {
            return;
        }
        String string2 = f.f.a.e.a.a.a.a().a("MraidJSController");
        if (!TextUtils.isEmpty((CharSequence)string2) && string2.equals((Object)string)) {
            return;
        }
        try {
            new a$b(context).a(0, string, null, new f.f.a.e.b.h.d.a((a)this, string){
                final /* synthetic */ String g;
                final /* synthetic */ a h;
                {
                    this.h = a2;
                    this.g = string;
                }

                public final void a(String string) {
                    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                    stringBuilder.append("request mraid js success, content = ");
                    stringBuilder.append(string);
                    h.a("MraidJSController", stringBuilder.toString());
                    if (!TextUtils.isEmpty((CharSequence)string)) {
                        a.a(this.h, string);
                        a.b(this.h, string);
                        f.f.a.e.a.a.a.a().a("MraidJSController", this.g);
                    }
                }

                public final void b(String string) {
                    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                    stringBuilder.append("fail request mraid js. ");
                    stringBuilder.append(string);
                    h.a("MraidJSController", stringBuilder.toString());
                }
            });
            return;
        }
        catch (Exception exception) {
            h.d("MraidJSController", exception.getMessage());
            return;
        }
    }

}

