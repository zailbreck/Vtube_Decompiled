/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.sqlite.SQLiteDatabase
 *  f.f.a.a
 *  f.f.a.e.d.g
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.String
 */
package f.f.a.e.d;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import f.f.a.a;
import f.f.a.e.d.g;

public class h
extends g {
    private static h b;

    private h(Context context) {
        super(context);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static h a(Context context) {
        if (b != null) return b;
        Class<h> class_ = h.class;
        synchronized (h.class) {
            if (b != null) return b;
            b = new h(context.getApplicationContext());
            // ** MonitorExit[var2_1] (shouldn't be in output)
            return b;
        }
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS campaign (id TEXT,unitid TEXT,tab INTEGER,package_name TEXT,app_name TEXT,app_desc TEXT,app_size TEXT,image_size TEXT,icon_url TEXT,image_url TEXT,impression_url TEXT,notice_url TEXT,download_url TEXT,deeplink_url TEXT,only_impression TEXT,preclick INTEGER,template INTEGER,landing_type TEXT,link_type INTEGER,click_mode TEXT,cti INTEGER,cpti INTEGER,star TEXT,level INTEGER,adSource INTEGER,fc_a INTEGER,fc_b INTEGER,ad_call TEXT,ad_url_list TEXT,video_url TEXT,video_size INTEGER,video_resolution TEXT,watch_mile INTEGER,video_length INTEGER,ts INTEGER,bty INTEGER,advImp TEXT,t_imp INTEGER,guidelines TEXT,offer_type INTEGER,html_url TEXT,end_screen_url TEXT,reward_amount INTEGER,reward_play_status INTEGER,ttc_ct2 INTEGER,ttc_type INTEGER,adv_id TEXT,retarget INTEGER,video_end_type INTEGER,playable_ads_without_video INTEGER,endcard_url TEXT,nv_t2 INTEGER,gif_url TEXT,reward_name TEXT,loopback TEXT,reward_teamplate TEXT,md5_file TEXT,jm_pd INTEGER,is_deleted INTEGER,is_click INTEGER,is_add_sucesful INTEGER,short_ctime TEXT,native_ad_tracking TEXT,c_coi INTEGER,c_ua INTEGER,ia_icon TEXT,ia_rst INTEGER,ia_url TEXT,ia_ori INTEGER,ad_type INTEGER,ia_ext1 TEXT,ia_ext2 TEXT,ia_cache TEXT,is_download_zip INTEGER,gh_id TEXT,gh_path TEXT,bind_id TEXT,oc_time INTEGER,oc_type INTEGER,t_list TEXT,adchoice TEXT,adchoice_size_height INTEGER,adchoice_size_width INTEGER,imp_ua INTEGER,endcard_click_result INTEGER,plct INTEGER,plctb INTEGER,is_bid_campaign INTEGER,bid_token TEXT,mraid TEXT,is_mraid_campaign INTEGER,omid TEXT,banner_url TEXT,banner_html TEXT,mof_tplid INTEGER,ready_rate INTEGER,ext_data TEXT,nscpt INTEGER,mof_template_url TEXT,req_ext_data TEXT,wtick INTEGER,creative_id INTEGER,readyState INTEGER,pv_urls TEXT,ad_zip TEXT,ad_html TEXT,load_timeout INTEGER,request_id TEXT,placement_id TEXT )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS report_campaign (id TEXT,unitid TEXT,tab INTEGER,package_name TEXT,app_name TEXT,app_desc TEXT,app_size TEXT,image_size TEXT,icon_url TEXT,image_url TEXT,impression_url TEXT,notice_url TEXT,download_url TEXT,wtick INTEGER,only_impression TEXT,preclick INTEGER,template INTEGER,landing_type TEXT,link_type INTEGER,click_mode TEXT,cti INTEGER,cpti INTEGER,star TEXT,level INTEGER,adSource INTEGER,fc_a INTEGER,ad_call TEXT,ad_url_list TEXT,video_url TEXT,video_size INTEGER,video_resolution TEXT,watch_mile INTEGER,video_length INTEGER,ts INTEGER,bty INTEGER,advImp TEXT,t_imp INTEGER,guidelines TEXT,offer_type INTEGER,html_url TEXT,end_screen_url TEXT,reward_amount INTEGER,reward_play_status INTEGER,ttc_ct2 INTEGER,ttc_type INTEGER,adv_id TEXT,retarget INTEGER,video_end_type INTEGER,playable_ads_without_video INTEGER,endcard_url TEXT,nv_t2 INTEGER,gif_url TEXT,reward_name TEXT,loopback TEXT,reward_teamplate TEXT,md5_file TEXT,native_ad_tracking TEXT,c_coi INTEGER,c_ua INTEGER,gh_id TEXT,bind_id TEXT,gh_path TEXT,imp_ua INTEGER,endcard_click_result INTEGER )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS shortcuts_campaign (id TEXT,unitid TEXT,tab INTEGER,package_name TEXT,app_name TEXT,app_desc TEXT,app_size TEXT,image_size TEXT,icon_url TEXT,image_url TEXT,impression_url TEXT,notice_url TEXT,download_url TEXT,wtick INTEGER,only_impression TEXT,preclick INTEGER,template INTEGER,landing_type TEXT,link_type INTEGER,click_mode TEXT,cti INTEGER,cpti INTEGER,star TEXT,level INTEGER,adSource INTEGER,fc_a INTEGER,ad_call TEXT,ad_url_list TEXT,video_url TEXT,video_size INTEGER,video_resolution TEXT,watch_mile INTEGER,video_length INTEGER,ts INTEGER,bty INTEGER,advImp TEXT,t_imp INTEGER,guidelines TEXT,offer_type INTEGER,html_url TEXT,end_screen_url TEXT,reward_amount INTEGER,reward_play_status INTEGER,ttc_ct2 INTEGER,ttc_type INTEGER,adv_id TEXT,retarget INTEGER,video_end_type INTEGER,playable_ads_without_video INTEGER,endcard_url TEXT,nv_t2 INTEGER,gif_url TEXT,reward_name TEXT,loopback TEXT,reward_teamplate TEXT,md5_file TEXT,local_ctime TEXT,jm_pd INTEGER,native_ad_tracking TEXT,c_coi INTEGER,c_ua INTEGER,gh_id TEXT,bind_id TEXT,gh_path TEXT,imp_ua INTEGER,endcard_click_result INTEGER )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS frequence (id TEXT,fc_a INTEGER,fc_b INTEGER,impression_count INTEGER,click_count INTEGER,ts INTEGER )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS campaignclick (id TEXT,unitid TEXT,result TEXT,ts INTEGER,pts INTEGER,cpei INTEGER,cpoci INTEGER,package_name TEXT,n4 INTEGER,ttc_ct2 INTEGER,ttc_type INTEGER,cps INTEGER,cti INTEGER,cpti INTEGER )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS reporterror (id integer primary key autoincrement,url TEXT,method TEXT,data TEXT,unitId TEXT)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS click_time(id integer primary key autoincrement,campaignId TEXT,click_type INTEGER,click_duration TEXT,last_url TEXT,code INTEGER,exception TEXT,header TEXT,content TEXT,network_type INTEGER,network_str TEXT,rid TEXT,unit_id TEXT,landing_type INTEGER,link_type INTEGER,click_time TEXT,market_result INTEGER,type INTEGER)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS load_stat (id integer primary key autoincrement,time TEXT,ad_source_id integer,adNum integer,unitId TEXT,fb integer,hb integer,timeout integer,network_type integer)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS video (id TEXT,unitid TEXT,tab INTEGER,package_name TEXT,app_name TEXT,app_desc TEXT,app_size TEXT,image_size TEXT,icon_url TEXT,image_url TEXT,impression_url TEXT,notice_url TEXT,download_url TEXT,only_impression TEXT,preclick INTEGER,template INTEGER,landing_type TEXT,link_type INTEGER,click_mode TEXT,cti INTEGER,cpti INTEGER,star TEXT,level INTEGER,adSource INTEGER,fc_a INTEGER,ad_call TEXT,ad_url_list TEXT,ad_bid_token TEXT,video_url TEXT,pregeress_size INTEGER,total_size INTEGER,video_download_start INTEGER,video_state INTEGER,video_path TEXT,endcard_click_result INTEGER,ts INTEGER  )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS reward_report (id integer primary key autoincrement,key TEXT,networkType INTEGER,network_str TEXT,isCompleteView INTEGER,watchedMillis INTEGER,videoLength INTEGER,image_url TEXT,template_url TEXT,rid TEXT,video_url TEXT,offerUrl TEXT,reason TEXT,result INTEGER,duration TEXT,ad_type TEXT,type TEXT,h5_click_data TEXT,endcard_url TEXT,unitId TEXT,campaignId TEXT,resource_type TEXT,device_id TEXT,creative TEXT,videoSize INTEGER,endcard_click_result INTEGER)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS offer_wall_click (id integer primary key autoincrement,unitId TEXT,campaignId TEXT,noticeUrl TEXT,host TEXT,clickId TEXT,install_status integer,time integer)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS exclude_info (id TEXT,unitId TEXT,time INTEGER,type INTEGER )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sc (package_name TEXT,click_mode TEXT,download_url TEXT,ttc INTEGER,get_time TEXT )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS c_did_time (did TEXT,id INTEGER PRIMARY KEY AUTOINCREMENT,d_time INTEGER )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS c_t_time (id INTEGER PRIMARY KEY AUTOINCREMENT,package_name TEXT,t_time INTEGER )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS dailyplaycap (unit_id TEXT,play_time INTEGER,first_insert_timestamp INTEGER )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS pinfo (package_name TEXT,label INTEGER,modify_time INTEGER,pkg_source TEXT )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS pbinfo (uuid TEXT,package_name TEXT,report TEXT )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS settingCampaign (id integer primary key autoincrement,url TEXT,method TEXT,data TEXT,iex INTEGER)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS display_resource_type (id integer primary key autoincrement,campaign_id TEXT,is_click INTEGER,click_time INTEGER,resource_type INTEGER )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS unit_id (placement_id TEXT,unitId TEXT,ad_type integer)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS download_record( id INTEGER PRIMARY KEY AUTOINCREMENT,download_id TEXT,download_url TEXT, resource_url TEXT,etag TEXT, director_path TEXT, file_name TEXT, total_bytes INTEGER, downloaded_bytes INTEGER, last_modified_time INTEGER,download_rate INTEGER,usage_counter INTEGER,download_resource_type INTEGER)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS batch_report (report_message TEXT,time INTEGER,report_state INTEGER,uuid TEXT)");
            return;
        }
        catch (Exception exception) {
            if (a.a) {
                exception.printStackTrace();
            }
            return;
        }
    }

    private void c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'campaign'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'campaign'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'frequence'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'campaignclick'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'reporterror'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'click_time'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'load_stat'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'video'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'reward_report'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'offer_wall_click'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'exclude_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'sc'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'c_did_time'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'c_t_time'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'dailyplaycap'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'pinfo'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'pbinfo'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'settingCampaign'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'display_resource_type'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'unit_id'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'download_record'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'batch_report'");
            return;
        }
        catch (Exception exception) {
            if (a.a) {
                exception.printStackTrace();
            }
            return;
        }
    }

    protected final void a(SQLiteDatabase sQLiteDatabase) {
        h.super.b(sQLiteDatabase);
    }

    protected final void a(SQLiteDatabase sQLiteDatabase, int n2, int n3) {
        h.super.c(sQLiteDatabase);
        h.super.b(sQLiteDatabase);
    }

    protected final void b(SQLiteDatabase sQLiteDatabase, int n2, int n3) {
        h.super.c(sQLiteDatabase);
        h.super.b(sQLiteDatabase);
    }

    protected final String c() {
        return "mintegral.msdk.db";
    }

    protected final int d() {
        return 53;
    }
}

