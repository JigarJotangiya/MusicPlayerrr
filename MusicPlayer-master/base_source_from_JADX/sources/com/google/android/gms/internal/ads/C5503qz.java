package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.recyclerview.widget.C0885l;
import com.un4seen.bass.BASS;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.qz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5503qz {

    /* renamed from: A */
    public static final C5207iz<Boolean> f22282A;

    /* renamed from: A0 */
    public static final C5207iz<Long> f22283A0 = C5207iz.m25451h(1, "gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5));

    /* renamed from: A1 */
    public static final C5207iz<Boolean> f22284A1;

    /* renamed from: A2 */
    public static final C5207iz<Boolean> f22285A2;

    /* renamed from: A3 */
    public static final C5207iz<Integer> f22286A3 = C5207iz.m25450g(1, "gads:uri_query_to_map_bg_thread:min_length", 1000);

    /* renamed from: A4 */
    public static final C5207iz<Integer> f22287A4 = C5207iz.m25450g(1, "gads:app_open_precache_pool:ad_time_limit", 14400);

    /* renamed from: A5 */
    public static final C5207iz<Boolean> f22288A5;

    /* renamed from: A6 */
    public static final C5207iz<Boolean> f22289A6;

    /* renamed from: B */
    public static final C5207iz<Boolean> f22290B;

    /* renamed from: B0 */
    public static final C5207iz<Boolean> f22291B0;

    /* renamed from: B1 */
    public static final t00<Boolean> f22292B1 = j10.f18303b;

    /* renamed from: B2 */
    public static final C5207iz<Boolean> f22293B2;

    /* renamed from: B3 */
    public static final C5207iz<Boolean> f22294B3;

    /* renamed from: B4 */
    public static final C5207iz<Boolean> f22295B4;

    /* renamed from: B5 */
    public static final C5207iz<Boolean> f22296B5;

    /* renamed from: B6 */
    public static final C5207iz<Boolean> f22297B6;

    /* renamed from: C */
    public static final C5207iz<String> f22298C = C5207iz.m25453j(1, "gads:video:codec_query_mime_types", BuildConfig.FLAVOR);

    /* renamed from: C0 */
    public static final C5207iz<Long> f22299C0 = C5207iz.m25451h(1, "gads:adid_values_in_adrequest:timeout", 2000);

    /* renamed from: C1 */
    public static final C5207iz<Boolean> f22300C1;

    /* renamed from: C2 */
    public static final C5207iz<Boolean> f22301C2;

    /* renamed from: C3 */
    public static final C5207iz<Boolean> f22302C3;

    /* renamed from: C4 */
    public static final C5207iz<Boolean> f22303C4;

    /* renamed from: C5 */
    public static final C5207iz<Boolean> f22304C5;

    /* renamed from: C6 */
    public static final C5207iz<Boolean> f22305C6;

    /* renamed from: D */
    public static final C5207iz<Integer> f22306D = C5207iz.m25450g(1, "gads:video:codec_query_minimum_version", 16);

    /* renamed from: D0 */
    public static final C5207iz<Boolean> f22307D0;

    /* renamed from: D1 */
    public static final C5207iz<Long> f22308D1 = C5207iz.m25451h(1, "gads:gestures:task_timeout", 2000);

    /* renamed from: D2 */
    public static final C5207iz<String> f22309D2 = C5207iz.m25453j(1, "gads:http_assets_cache:regex", "(?i)https:\\/\\/(tpc\\.googlesyndication\\.com\\/(.*)|lh\\d+\\.googleusercontent\\.com\\/(.*))");

    /* renamed from: D3 */
    public static final C5207iz<Boolean> f22310D3;

    /* renamed from: D4 */
    public static final C5207iz<Boolean> f22311D4;

    /* renamed from: D5 */
    public static final C5207iz<Boolean> f22312D5;

    /* renamed from: D6 */
    public static final C5207iz<Boolean> f22313D6;

    /* renamed from: E */
    public static final C5207iz<String> f22314E = C5207iz.m25453j(1, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_banner.js");

    /* renamed from: E0 */
    public static final C5207iz<Long> f22315E0 = C5207iz.m25451h(1, "gads:ad_overlay:delay_page_close_timeout_ms", 5000);

    /* renamed from: E1 */
    public static final C5207iz<Boolean> f22316E1;

    /* renamed from: E2 */
    public static final C5207iz<Integer> f22317E2 = C5207iz.m25450g(1, "gads:http_assets_cache:time_out", 100);

    /* renamed from: E3 */
    public static final C5207iz<Boolean> f22318E3;

    /* renamed from: E4 */
    public static final C5207iz<Boolean> f22319E4;

    /* renamed from: E5 */
    public static final C5207iz<Boolean> f22320E5;

    /* renamed from: E6 */
    public static final C5207iz<Boolean> f22321E6;

    /* renamed from: F */
    public static final C5207iz<String> f22322F = C5207iz.m25453j(1, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_expanded_banner.js");

    /* renamed from: F0 */
    public static final C5207iz<Boolean> f22323F0;

    /* renamed from: F1 */
    public static final C5207iz<Boolean> f22324F1;

    /* renamed from: F2 */
    public static final C5207iz<Boolean> f22325F2;

    /* renamed from: F3 */
    public static final C5207iz<Boolean> f22326F3;

    /* renamed from: F4 */
    public static final C5207iz<Boolean> f22327F4;

    /* renamed from: F5 */
    public static final C5207iz<Boolean> f22328F5;

    /* renamed from: F6 */
    public static final C5207iz<Boolean> f22329F6;

    /* renamed from: G */
    public static final C5207iz<String> f22330G = C5207iz.m25453j(1, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_interstitial.js");

    /* renamed from: G0 */
    public static final C5207iz<Boolean> f22331G0;

    /* renamed from: G1 */
    public static final C5207iz<Boolean> f22332G1;

    /* renamed from: G2 */
    public static final C5207iz<Boolean> f22333G2;

    /* renamed from: G3 */
    public static final C5207iz<Boolean> f22334G3;

    /* renamed from: G4 */
    public static final C5207iz<String> f22335G4 = C5207iz.m25453j(1, "gads:csi:error_parsing:regex", "^(\\d+)");

    /* renamed from: G5 */
    public static final C5207iz<Boolean> f22336G5;

    /* renamed from: G6 */
    public static final C5207iz<Boolean> f22337G6;

    /* renamed from: H */
    public static final C5207iz<String> f22338H = C5207iz.m25453j(1, "gad:mraid:version", "3.0");

    /* renamed from: H0 */
    public static final C5207iz<Boolean> f22339H0;

    /* renamed from: H1 */
    public static final C5207iz<Boolean> f22340H1;

    /* renamed from: H2 */
    public static final C5207iz<Boolean> f22341H2;

    /* renamed from: H3 */
    public static final C5207iz<Boolean> f22342H3;

    /* renamed from: H4 */
    public static final C5207iz<Boolean> f22343H4;

    /* renamed from: H5 */
    public static final C5207iz<Boolean> f22344H5;

    /* renamed from: H6 */
    public static final C5207iz<Boolean> f22345H6;

    /* renamed from: I */
    public static final C5207iz<Boolean> f22346I;

    /* renamed from: I0 */
    public static final C5207iz<String> f22347I0 = C5207iz.m25453j(1, "gads:close_button_asset_name", "default");

    /* renamed from: I1 */
    public static final C5207iz<Boolean> f22348I1;

    /* renamed from: I2 */
    public static final C5207iz<Boolean> f22349I2;

    /* renamed from: I3 */
    public static final C5207iz<Boolean> f22350I3;

    /* renamed from: I4 */
    public static final C5207iz<Boolean> f22351I4;

    /* renamed from: I5 */
    public static final C5207iz<Boolean> f22352I5;

    /* renamed from: J */
    public static final C5207iz<Boolean> f22353J;

    /* renamed from: J0 */
    public static final C5207iz<Long> f22354J0 = C5207iz.m25451h(1, "gads:close_button_fade_in_duration_ms", 0);

    /* renamed from: J1 */
    public static final C5207iz<Boolean> f22355J1;

    /* renamed from: J2 */
    public static final C5207iz<Boolean> f22356J2;

    /* renamed from: J3 */
    public static final C5207iz<Boolean> f22357J3;

    /* renamed from: J4 */
    public static final C5207iz<Boolean> f22358J4;

    /* renamed from: J5 */
    public static final C5207iz<Boolean> f22359J5;

    /* renamed from: K */
    public static final C5207iz<Integer> f22360K = C5207iz.m25450g(1, "gads:content_vertical_fingerprint_number", 100);

    /* renamed from: K0 */
    public static final C5207iz<Boolean> f22361K0;

    /* renamed from: K1 */
    public static final C5207iz<Boolean> f22362K1;

    /* renamed from: K2 */
    public static final C5207iz<Boolean> f22363K2;

    /* renamed from: K3 */
    public static final C5207iz<Boolean> f22364K3;

    /* renamed from: K4 */
    public static final C5207iz<Boolean> f22365K4;

    /* renamed from: K5 */
    public static final C5207iz<Integer> f22366K5 = C5207iz.m25450g(1, "gads:remote_log_send_rate_ms", 60000);

    /* renamed from: L */
    public static final C5207iz<Integer> f22367L = C5207iz.m25450g(1, "gads:content_vertical_fingerprint_bits", 23);

    /* renamed from: L0 */
    public static final C5207iz<Boolean> f22368L0;

    /* renamed from: L1 */
    public static final C5207iz<String> f22369L1 = C5207iz.m25453j(1, "gads:gestures:pk", BuildConfig.FLAVOR);

    /* renamed from: L2 */
    public static final C5207iz<Boolean> f22370L2;

    /* renamed from: L3 */
    public static final C5207iz<Boolean> f22371L3;

    /* renamed from: L4 */
    public static final C5207iz<Integer> f22372L4 = C5207iz.m25450g(1, "gads:maximum_query_json_cache_size", C0885l.C0891f.DEFAULT_DRAG_ANIMATION_DURATION);

    /* renamed from: L5 */
    public static final C5207iz<Integer> f22373L5 = C5207iz.m25450g(1, "gads:remote_log_queue_max_entries", BASS.BASS_ERROR_JAVA_CLASS);

    /* renamed from: M */
    public static final C5207iz<Integer> f22374M = C5207iz.m25450g(1, "gads:content_vertical_fingerprint_ngram", 3);

    /* renamed from: M0 */
    public static final C5207iz<Boolean> f22375M0;

    /* renamed from: M1 */
    public static final C5207iz<Boolean> f22376M1;

    /* renamed from: M2 */
    public static final C5207iz<String> f22377M2 = C5207iz.m25453j(1, "gad:publisher_testing:cct_v2:enabled_list", BuildConfig.FLAVOR);

    /* renamed from: M3 */
    public static final C5207iz<Boolean> f22378M3;

    /* renamed from: M4 */
    public static final C5207iz<Long> f22379M4 = C5207iz.m25451h(1, "gads:timeout_query_json_cache:millis", 3600000);

    /* renamed from: M5 */
    public static final C5207iz<String> f22380M5 = C5207iz.m25453j(1, "gads:remote_capture_service_url", "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1");

    /* renamed from: N */
    public static final C5207iz<String> f22381N = C5207iz.m25453j(1, "gads:content_fetch_view_tag_id", "googlebot");

    /* renamed from: N0 */
    public static final C5207iz<String> f22382N0 = C5207iz.m25453j(1, "gads:spherical_video:vertex_shader", BuildConfig.FLAVOR);

    /* renamed from: N1 */
    public static final C5207iz<Boolean> f22383N1;

    /* renamed from: N2 */
    public static final C5207iz<Boolean> f22384N2;

    /* renamed from: N3 */
    public static final C5207iz<Long> f22385N3 = C5207iz.m25451h(1, "gads:mobius_linking:sdk_side_cooldown_time_threshold:ms", 3600000);

    /* renamed from: N4 */
    public static final C5207iz<Boolean> f22386N4;

    /* renamed from: N5 */
    public static final C5207iz<Integer> f22387N5 = C5207iz.m25450g(1, "gads:cui_monitoring_interval_ms", 300000);

    /* renamed from: O */
    public static final C5207iz<String> f22388O = C5207iz.m25453j(1, "gads:content_fetch_exclude_view_tag", "none");

    /* renamed from: O0 */
    public static final C5207iz<String> f22389O0 = C5207iz.m25453j(1, "gads:spherical_video:fragment_shader", BuildConfig.FLAVOR);

    /* renamed from: O1 */
    public static final C5207iz<Boolean> f22390O1;

    /* renamed from: O2 */
    public static final C5207iz<Long> f22391O2 = C5207iz.m25451h(1, "gads:debug_hold_gesture:time_millis", 2000);

    /* renamed from: O3 */
    public static final C5207iz<Integer> f22392O3 = C5207iz.m25450g(1, "gads:adoverlay:b68684796:targeting_sdk:lower_bound", 27);

    /* renamed from: O4 */
    public static final C5207iz<Boolean> f22393O4;

    /* renamed from: O5 */
    public static final C5207iz<String> f22394O5 = C5207iz.m25453j(1, "gads:plugin_regex", "^Flutter-GMA-.*|^unity-.*");

    /* renamed from: P */
    public static final C5207iz<Boolean> f22395P;

    /* renamed from: P0 */
    public static final C5207iz<Boolean> f22396P0;

    /* renamed from: P1 */
    public static final C5207iz<Boolean> f22397P1;

    /* renamed from: P2 */
    public static final C5207iz<String> f22398P2 = C5207iz.m25453j(1, "gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");

    /* renamed from: P3 */
    public static final C5207iz<Integer> f22399P3 = C5207iz.m25450g(1, "gads:adoverlay:b68684796:targeting_sdk:upper_bound", 26);

    /* renamed from: P4 */
    public static final C5207iz<Boolean> f22400P4;

    /* renamed from: P5 */
    public static final C5207iz<Integer> f22401P5 = C5207iz.m25450g(1, "gads:app_event_queue_size", 20);

    /* renamed from: Q */
    public static final C5207iz<Boolean> f22402Q;

    /* renamed from: Q0 */
    public static final C5207iz<Long> f22403Q0 = C5207iz.m25451h(1, "gads:position_watcher:throttle_ms", 200);

    /* renamed from: Q1 */
    public static final C5207iz<Boolean> f22404Q1;

    /* renamed from: Q2 */
    public static final C5207iz<String> f22405Q2 = C5207iz.m25453j(1, "gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");

    /* renamed from: Q3 */
    public static final C5207iz<Integer> f22406Q3 = C5207iz.m25450g(1, "gads:adoverlay:b68684796:sdk_int:lower_bound", 27);

    /* renamed from: Q4 */
    public static final C5207iz<Long> f22407Q4 = C5207iz.m25451h(1, "gads:timeout_signal_collection_in_exp:millis", 1000);

    /* renamed from: Q5 */
    public static final C5207iz<Boolean> f22408Q5;

    /* renamed from: R */
    public static final C5207iz<Boolean> f22409R;

    /* renamed from: R0 */
    public static final C5207iz<Long> f22410R0 = C5207iz.m25451h(1, "gads:position_watcher:scroll_aware_throttle_ms", 33);

    /* renamed from: R1 */
    public static final C5207iz<Boolean> f22411R1;

    /* renamed from: R2 */
    public static final C5207iz<String> f22412R2 = C5207iz.m25453j(1, "gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");

    /* renamed from: R3 */
    public static final C5207iz<Integer> f22413R3 = C5207iz.m25450g(1, "gads:adoverlay:b68684796:sdk_int:upper_bound", 26);

    /* renamed from: R4 */
    public static final C5207iz<Boolean> f22414R4;

    /* renamed from: R5 */
    public static final C5207iz<Boolean> f22415R5;

    /* renamed from: S */
    public static final C5207iz<Boolean> f22416S;

    /* renamed from: S0 */
    public static final C5207iz<Boolean> f22417S0;

    /* renamed from: S1 */
    public static final C5207iz<Boolean> f22418S1;

    /* renamed from: S2 */
    public static final C5207iz<String> f22419S2 = C5207iz.m25453j(1, "gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");

    /* renamed from: S3 */
    public static final C5207iz<Boolean> f22420S3;

    /* renamed from: S4 */
    public static final C5207iz<Boolean> f22421S4;

    /* renamed from: S5 */
    public static final C5207iz<Boolean> f22422S5;

    /* renamed from: T */
    public static final C5207iz<String> f22423T = C5207iz.m25453j(1, "gads:sai:click_ping_schema_v2", "^[^?]*(/aclk\\?|/pcs/click\\?).*");

    /* renamed from: T0 */
    public static final C5207iz<Boolean> f22424T0;

    /* renamed from: T1 */
    public static final C5207iz<Boolean> f22425T1;

    /* renamed from: T2 */
    public static final C5207iz<Integer> f22426T2 = C5207iz.m25450g(1, "gads:drx_debug:timeout_ms", 5000);

    /* renamed from: T3 */
    public static final C5207iz<Boolean> f22427T3;

    /* renamed from: T4 */
    public static final C5207iz<Boolean> f22428T4;

    /* renamed from: T5 */
    public static final C5207iz<String> f22429T5 = C5207iz.m25453j(1, "gads:inspector:ui_url", "https://admob-gmats.uc.r.appspot.com/");

    /* renamed from: U */
    public static final C5207iz<String> f22430U = C5207iz.m25453j(1, "gads:sai:impression_ping_schema_v2", "^[^?]*(/adview|/pcs/view).*");

    /* renamed from: U0 */
    public static final C5207iz<String> f22431U0 = C5207iz.m25453j(1, "gads:logged_adapter_version_classes", BuildConfig.FLAVOR);

    /* renamed from: U1 */
    public static final C5207iz<Boolean> f22432U1;

    /* renamed from: U2 */
    public static final C5207iz<Integer> f22433U2 = C5207iz.m25450g(1, "gad:pixel_dp_comparision_multiplier", 1);

    /* renamed from: U3 */
    public static final C5207iz<Boolean> f22434U3;

    /* renamed from: U4 */
    public static final C5207iz<String> f22435U4 = C5207iz.m25453j(1, "gads:scar_v2:user_agent:key", "ua");

    /* renamed from: U5 */
    public static final C5207iz<Integer> f22436U5 = C5207iz.m25450g(1, "gads:inspector:max_ad_life_cycles", 1000);

    /* renamed from: V */
    public static final C5207iz<Boolean> f22437V;

    /* renamed from: V0 */
    public static final C5207iz<Long> f22438V0 = C5207iz.m25451h(1, "gads:rtb_v1_1:signal_timeout_ms", 1000);

    /* renamed from: V1 */
    public static final C5207iz<Boolean> f22439V1;

    /* renamed from: V2 */
    public static final C5207iz<Boolean> f22440V2;

    /* renamed from: V3 */
    public static final C5207iz<String> f22441V3 = C5207iz.m25453j(1, "gads:sp:json_string", BuildConfig.FLAVOR);

    /* renamed from: V4 */
    public static final C5207iz<Boolean> f22442V4;

    /* renamed from: V5 */
    public static final C5207iz<Integer> f22443V5 = C5207iz.m25450g(1, "gads:inspector:ui_invocation_millis", 2000);

    /* renamed from: W */
    public static final C5207iz<String> f22444W = C5207iz.m25453j(1, "gads:sai:ad_event_id_macro_name", "[gw_fbsaeid]");

    /* renamed from: W0 */
    public static final C5207iz<String> f22445W0 = C5207iz.m25453j(1, "gads:rtb_logging:regex", "(?!)");

    /* renamed from: W1 */
    public static final C5207iz<Boolean> f22446W1;

    /* renamed from: W2 */
    public static final C5207iz<Boolean> f22447W2;

    /* renamed from: W3 */
    public static final C5207iz<Boolean> f22448W3;

    /* renamed from: W4 */
    public static final C5207iz<String> f22449W4 = C5207iz.m25453j(1, "gads:scar_v2:prior_click_count:key", "pcc");

    /* renamed from: W5 */
    public static final C5207iz<Boolean> f22450W5;

    /* renamed from: X */
    public static final C5207iz<Long> f22451X = C5207iz.m25451h(1, "gads:sai:timeout_ms", -1);

    /* renamed from: X0 */
    public static final C5207iz<Boolean> f22452X0;

    /* renamed from: X1 */
    public static final C5207iz<Boolean> f22453X1;

    /* renamed from: X2 */
    public static final C5207iz<Boolean> f22454X2;

    /* renamed from: X3 */
    public static final C5207iz<Integer> f22455X3 = C5207iz.m25450g(1, "gads:nativeads:image:sample:pixels", 1048576);

    /* renamed from: X4 */
    public static final C5207iz<String> f22456X4 = C5207iz.m25453j(1, "gads:scar_v2:pings_from_gma:key", "is_gma");

    /* renamed from: X5 */
    public static final C5207iz<Float> f22457X5 = C5207iz.m25449f(1, "gads:inspector:shake_strength", 2.0f);

    /* renamed from: Y */
    public static final C5207iz<Integer> f22458Y = C5207iz.m25450g(1, "gads:sai:scion_thread_pool_size", 5);

    /* renamed from: Y0 */
    public static final C5207iz<Boolean> f22459Y0;

    /* renamed from: Y1 */
    public static final C5207iz<Integer> f22460Y1 = C5207iz.m25450g(1, "gads:gass:impression_retry:count", 0);

    /* renamed from: Y2 */
    public static final C5207iz<Boolean> f22461Y2;

    /* renamed from: Y3 */
    public static final C5207iz<Boolean> f22462Y3;

    /* renamed from: Y4 */
    public static final C5207iz<Boolean> f22463Y4;

    /* renamed from: Y5 */
    public static final C5207iz<Integer> f22464Y5 = C5207iz.m25450g(1, "gads:inspector:shake_interval", BASS.BASS_ERROR_JAVA_CLASS);

    /* renamed from: Z */
    public static final C5207iz<Boolean> f22465Z;

    /* renamed from: Z0 */
    public static final C5207iz<Boolean> f22466Z0;

    /* renamed from: Z1 */
    public static final C5207iz<Integer> f22467Z1 = C5207iz.m25450g(1, "gads:gass:impression_retry:delay_ms", 400);

    /* renamed from: Z2 */
    public static final C5207iz<Integer> f22468Z2 = C5207iz.m25450g(1, "gad:interstitial:close_button_padding_dip", 0);

    /* renamed from: Z3 */
    public static final C5207iz<Boolean> f22469Z3;

    /* renamed from: Z4 */
    public static final C5207iz<Integer> f22470Z4 = C5207iz.m25450g(1, "gads:native_ads_signal:timeout", 1000);

    /* renamed from: Z5 */
    public static final C5207iz<Integer> f22471Z5 = C5207iz.m25450g(1, "gads:inspector:shake_reset_time_ms", 3000);

    /* renamed from: a */
    public static final C5207iz<String> f22472a = C5207iz.m25453j(1, "gads:sdk_core_location:client:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");

    /* renamed from: a0 */
    public static final C5207iz<Integer> f22473a0 = C5207iz.m25450g(1, "gads:sai:app_measurement_min_client_dynamite_version", 20290);

    /* renamed from: a1 */
    public static final C5207iz<Boolean> f22474a1;

    /* renamed from: a2 */
    public static final C5207iz<String> f22475a2 = C5207iz.m25453j(1, "gads:sdk_core_constants:caps", BuildConfig.FLAVOR);

    /* renamed from: a3 */
    public static final C5207iz<Boolean> f22476a3;

    /* renamed from: a4 */
    public static final C5207iz<Integer> f22477a4 = C5207iz.m25450g(1, "gads:offline_signaling:log_maximum", 100);

    /* renamed from: a5 */
    public static final C5207iz<Boolean> f22478a5;

    /* renamed from: a6 */
    public static final C5207iz<Integer> f22479a6 = C5207iz.m25450g(1, "gads:inspector:shake_count", 3);

    /* renamed from: b */
    public static final C5207iz<String> f22480b = C5207iz.m25453j(1, "gads:video_exo_player:version", "3");

    /* renamed from: b0 */
    public static final C5207iz<Boolean> f22481b0;

    /* renamed from: b1 */
    public static final C5207iz<Integer> f22482b1 = C5207iz.m25450g(1, "gads:native_ad_options_rtb:min_version", 204890000);

    /* renamed from: b2 */
    public static final C5207iz<String> f22483b2 = C5207iz.m25453j(1, "gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");

    /* renamed from: b3 */
    public static final C5207iz<Boolean> f22484b3;

    /* renamed from: b4 */
    public static final C5207iz<Boolean> f22485b4;

    /* renamed from: b5 */
    public static final C5207iz<Boolean> f22486b5;

    /* renamed from: b6 */
    public static final C5207iz<Boolean> f22487b6;

    /* renamed from: c */
    public static final C5207iz<Integer> f22488c = C5207iz.m25450g(1, "gads:video_exo_player:connect_timeout", 8000);

    /* renamed from: c0 */
    public static final C5207iz<Boolean> f22489c0;

    /* renamed from: c1 */
    public static final C5207iz<Boolean> f22490c1;

    /* renamed from: c2 */
    public static final C5207iz<String> f22491c2 = C5207iz.m25453j(1, "gads:native:video_url_with_protocol", "https://imasdk.googleapis.com/admob/sdkloader/native_video.html");

    /* renamed from: c3 */
    public static final C5207iz<Boolean> f22492c3;

    /* renamed from: c4 */
    public static final C5207iz<Boolean> f22493c4;

    /* renamed from: c5 */
    public static final C5207iz<Boolean> f22494c5;

    /* renamed from: c6 */
    public static final C5207iz<Float> f22495c6 = C5207iz.m25449f(1, "gads:inspector:flick_rotation_threshold", 45.0f);

    /* renamed from: d */
    public static final C5207iz<Integer> f22496d = C5207iz.m25450g(1, "gads:video_exo_player:read_timeout", 8000);

    /* renamed from: d0 */
    public static final C5207iz<Boolean> f22497d0;

    /* renamed from: d1 */
    public static final C5207iz<Boolean> f22498d1;

    /* renamed from: d2 */
    public static final C5207iz<Boolean> f22499d2;

    /* renamed from: d3 */
    public static final C5207iz<String> f22500d3 = C5207iz.m25453j(1, "gad:publisher_testing:force_local_request:enabled_list", BuildConfig.FLAVOR);

    /* renamed from: d4 */
    public static final C5207iz<Boolean> f22501d4;

    /* renamed from: d5 */
    public static final C5207iz<Boolean> f22502d5;

    /* renamed from: d6 */
    public static final C5207iz<Integer> f22503d6 = C5207iz.m25450g(1, "gads:inspector:flick_reset_time_ms", 3000);

    /* renamed from: e */
    public static final C5207iz<Integer> f22504e = C5207iz.m25450g(1, "gads:video_exo_player:loading_check_interval", 1048576);

    /* renamed from: e0 */
    public static final C5207iz<Boolean> f22505e0;

    /* renamed from: e1 */
    public static final C5207iz<Boolean> f22506e1;

    /* renamed from: e2 */
    public static final C5207iz<Integer> f22507e2 = C5207iz.m25450g(1, "gads:native_video_load_timeout", 10);

    /* renamed from: e3 */
    public static final C5207iz<String> f22508e3 = C5207iz.m25453j(1, "gad:publisher_testing:force_local_request:disabled_list", BuildConfig.FLAVOR);

    /* renamed from: e4 */
    public static final C5207iz<Boolean> f22509e4;

    /* renamed from: e5 */
    public static final C5207iz<Boolean> f22510e5;

    /* renamed from: e6 */
    public static final C5207iz<Integer> f22511e6 = C5207iz.m25450g(1, "gads:inspector:flick_count", 2);

    /* renamed from: f */
    public static final C5207iz<Integer> f22512f = C5207iz.m25450g(1, "gads:video_exo_player:exo_player_precache_limit", Integer.MAX_VALUE);

    /* renamed from: f0 */
    public static final C5207iz<Boolean> f22513f0;

    /* renamed from: f1 */
    public static final C5207iz<Boolean> f22514f1;

    /* renamed from: f2 */
    public static final C5207iz<String> f22515f2 = C5207iz.m25453j(1, "gads:ad_choices_content_description", "Ad Choices Icon");

    /* renamed from: f3 */
    public static final C5207iz<Integer> f22516f3 = C5207iz.m25450g(1, "gad:http_redirect_max_count:times", 8);

    /* renamed from: f4 */
    public static final C5207iz<Boolean> f22517f4;

    /* renamed from: f5 */
    public static final C5207iz<Boolean> f22518f5;

    /* renamed from: f6 */
    public static final C5207iz<Integer> f22519f6 = C5207iz.m25450g(1, "gads:inspector:icon_width_px", 256);

    /* renamed from: g */
    public static final C5207iz<Integer> f22520g = C5207iz.m25450g(1, "gads:video_exo_player:byte_buffer_precache_limit", Integer.MAX_VALUE);

    /* renamed from: g0 */
    public static final C5207iz<Boolean> f22521g0;

    /* renamed from: g1 */
    public static final C5207iz<Integer> f22522g1 = C5207iz.m25450g(1, "gads:adapter_initialization:min_sdk_version", 15301000);

    /* renamed from: g2 */
    public static final C5207iz<Boolean> f22523g2;

    /* renamed from: g3 */
    public static final C5207iz<Boolean> f22524g3;

    /* renamed from: g4 */
    public static final C5207iz<Boolean> f22525g4;

    /* renamed from: g5 */
    public static final C5207iz<String> f22526g5 = C5207iz.m25453j(1, "gad:publisher_testing:policy_validator:enabled_list", BuildConfig.FLAVOR);

    /* renamed from: g6 */
    public static final C5207iz<Integer> f22527g6 = C5207iz.m25450g(1, "gads:inspector:icon_height_px", 256);

    /* renamed from: h */
    public static final C5207iz<Integer> f22528h = C5207iz.m25450g(1, "gads:video_exo_player_socket_receive_buffer_size", 0);

    /* renamed from: h0 */
    public static final C5207iz<Boolean> f22529h0;

    /* renamed from: h1 */
    public static final C5207iz<Long> f22530h1 = C5207iz.m25451h(1, "gads:adapter_initialization:timeout", 30);

    /* renamed from: h2 */
    public static final C5207iz<Boolean> f22531h2;

    /* renamed from: h3 */
    public static final C5207iz<Integer> f22532h3 = C5207iz.m25450g(1, "gads:omid:destroy_webview_delay", 1000);

    /* renamed from: h4 */
    public static final C5207iz<Boolean> f22533h4;

    /* renamed from: h5 */
    public static final C5207iz<Integer> f22534h5 = C5207iz.m25450g(1, "gads:policy_validator_layoutparam:flags", 808);

    /* renamed from: h6 */
    public static final C5207iz<Boolean> f22535h6;

    /* renamed from: i */
    public static final C5207iz<Integer> f22536i = C5207iz.m25450g(1, "gads:video_exo_player:min_retry_count", -1);

    /* renamed from: i0 */
    public static final C5207iz<Boolean> f22537i0;

    /* renamed from: i1 */
    public static final C5207iz<Long> f22538i1 = C5207iz.m25451h(1, "gads:adapter_initialization:cld_timeout", 10);

    /* renamed from: i2 */
    public static final C5207iz<Boolean> f22539i2;

    /* renamed from: i3 */
    public static final C5207iz<Boolean> f22540i3;

    /* renamed from: i4 */
    public static final C5207iz<Boolean> f22541i4;

    /* renamed from: i5 */
    public static final C5207iz<Boolean> f22542i5;

    /* renamed from: i6 */
    public static final C5207iz<Boolean> f22543i6;

    /* renamed from: j */
    public static final C5207iz<Boolean> f22544j;

    /* renamed from: j0 */
    public static final C5207iz<String> f22545j0 = C5207iz.m25453j(1, "gads:sai:server_side_npa:shared_preference_key_list", "{  \"__default__\": [    \"IABTCF_TCString\"  ],  \"mobileads_consent\": [    \"consent_string\"  ]}");

    /* renamed from: j1 */
    public static final C5207iz<Boolean> f22546j1;

    /* renamed from: j2 */
    public static final C5207iz<Boolean> f22547j2;

    /* renamed from: j3 */
    public static final C5207iz<Boolean> f22548j3;

    /* renamed from: j4 */
    public static final C5207iz<Integer> f22549j4 = C5207iz.m25450g(1, "gads:rewarded_precache_pool:count", 0);

    /* renamed from: j5 */
    public static final C5207iz<Integer> f22550j5 = C5207iz.m25450g(1, "gads:policy_validator_overlay_width:dp", 350);

    /* renamed from: j6 */
    public static final C5207iz<Boolean> f22551j6;

    /* renamed from: k */
    public static final C5207iz<Boolean> f22552k;

    /* renamed from: k0 */
    public static final C5207iz<Boolean> f22553k0;

    /* renamed from: k1 */
    public static final C5207iz<Boolean> f22554k1;

    /* renamed from: k2 */
    public static final C5207iz<Boolean> f22555k2;

    /* renamed from: k3 */
    public static final C5207iz<Integer> f22556k3 = C5207iz.m25450g(1, "gads:app_open_beta:min_version", 999999999);

    /* renamed from: k4 */
    public static final C5207iz<Integer> f22557k4 = C5207iz.m25450g(1, "gads:interstitial_precache_pool:count", 0);

    /* renamed from: k5 */
    public static final C5207iz<Integer> f22558k5 = C5207iz.m25450g(1, "gads:policy_validator_overlay_height:dp", 140);

    /* renamed from: k6 */
    public static final C5207iz<Boolean> f22559k6;

    /* renamed from: l */
    public static final C5207iz<Boolean> f22560l;

    /* renamed from: l0 */
    public static final C5207iz<Boolean> f22561l0;

    /* renamed from: l1 */
    public static final C5207iz<Boolean> f22562l1;

    /* renamed from: l2 */
    public static final C5207iz<Boolean> f22563l2;

    /* renamed from: l3 */
    public static final C5207iz<Integer> f22564l3 = C5207iz.m25450g(1, "gads:app_open_ad_open_beta_api:min_version", 202490999);

    /* renamed from: l4 */
    public static final C5207iz<String> f22565l4 = C5207iz.m25453j(1, "gads:rewarded_precache_pool:discard_strategy", "lru");

    /* renamed from: l5 */
    public static final C5207iz<Boolean> f22566l5;

    /* renamed from: l6 */
    public static final C5207iz<Boolean> f22567l6;

    /* renamed from: m */
    public static final C5207iz<Integer> f22568m = C5207iz.m25450g(1, "gads:video_stream_cache:limit_count", 5);

    /* renamed from: m0 */
    public static final C5207iz<Boolean> f22569m0;

    /* renamed from: m1 */
    public static final C5207iz<Boolean> f22570m1;

    /* renamed from: m2 */
    public static final C5207iz<Boolean> f22571m2;

    /* renamed from: m3 */
    public static final C5207iz<Boolean> f22572m3;

    /* renamed from: m4 */
    public static final C5207iz<String> f22573m4 = C5207iz.m25453j(1, "gads:interstitial_precache_pool:discard_strategy", "lru");

    /* renamed from: m5 */
    public static final C5207iz<Boolean> f22574m5;

    /* renamed from: m6 */
    public static final C5207iz<Boolean> f22575m6;

    /* renamed from: n */
    public static final C5207iz<Integer> f22576n = C5207iz.m25450g(1, "gads:video_stream_cache:limit_space", 8388608);

    /* renamed from: n0 */
    public static final C5207iz<String> f22577n0 = C5207iz.m25453j(1, "gads:idless:cookie_modification", "=; Max-Age=-1; path=/; domain=.doubleclick.net");

    /* renamed from: n1 */
    public static final C5207iz<Boolean> f22578n1;

    /* renamed from: n2 */
    public static final C5207iz<Boolean> f22579n2;

    /* renamed from: n3 */
    public static final C5207iz<Boolean> f22580n3;

    /* renamed from: n4 */
    public static final C5207iz<String> f22581n4 = C5207iz.m25453j(1, "gads:rewarded_precache_pool:cache_start_trigger", "onAdClosed");

    /* renamed from: n5 */
    public static final C5207iz<Boolean> f22582n5;

    /* renamed from: n6 */
    public static final C5207iz<Integer> f22583n6 = C5207iz.m25450g(1, "gads:h5ads:max_num_ad_objects", 10);

    /* renamed from: o */
    public static final C5207iz<Integer> f22584o = C5207iz.m25450g(1, "gads:video_stream_exo_cache:buffer_size", 8388608);

    /* renamed from: o0 */
    public static final C5207iz<Boolean> f22585o0;

    /* renamed from: o1 */
    public static final C5207iz<Boolean> f22586o1;

    /* renamed from: o2 */
    public static final C5207iz<Boolean> f22587o2;

    /* renamed from: o3 */
    public static final C5207iz<String> f22588o3;

    /* renamed from: o4 */
    public static final C5207iz<String> f22589o4 = C5207iz.m25453j(1, "gads:interstitial_precache_pool:cache_start_trigger", "onAdClosed");

    /* renamed from: o5 */
    public static final C5207iz<Boolean> f22590o5;

    /* renamed from: o6 */
    public static final C5207iz<String> f22591o6 = C5207iz.m25453j(1, "gads:h5ads:afma_prefix", "(window.AFMA_ReceiveMessage||function(msg,params){window.h5_iframe.contentWindow.postMessage({messageName:'receive_message_action',parameters:{messageName:msg,parameters:params}},'*');})");

    /* renamed from: p */
    public static final C5207iz<Long> f22592p = C5207iz.m25451h(1, "gads:video_stream_cache:limit_time_sec", 300);

    /* renamed from: p0 */
    public static final C5207iz<Boolean> f22593p0;

    /* renamed from: p1 */
    public static final C5207iz<Boolean> f22594p1;

    /* renamed from: p2 */
    public static final C5207iz<Boolean> f22595p2;

    /* renamed from: p3 */
    public static final C5207iz<Boolean> f22596p3;

    /* renamed from: p4 */
    public static final C5207iz<Integer> f22597p4 = C5207iz.m25450g(1, "gads:rewarded_precache_pool:size", 1);

    /* renamed from: p5 */
    public static final C5207iz<Boolean> f22598p5;

    /* renamed from: p6 */
    public static final C5207iz<Boolean> f22599p6;

    /* renamed from: q */
    public static final C5207iz<Long> f22600q = C5207iz.m25451h(1, "gads:video_stream_cache:notify_interval_millis", 125);

    /* renamed from: q0 */
    public static final C5207iz<Boolean> f22601q0;

    /* renamed from: q1 */
    public static final C5207iz<Boolean> f22602q1;

    /* renamed from: q2 */
    public static final C5207iz<Long> f22603q2 = C5207iz.m25451h(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000);

    /* renamed from: q3 */
    public static final C5207iz<Boolean> f22604q3;

    /* renamed from: q4 */
    public static final C5207iz<Integer> f22605q4 = C5207iz.m25450g(1, "gads:interstitial_precache_pool:size", 1);

    /* renamed from: q5 */
    public static final C5207iz<String> f22606q5 = C5207iz.m25453j(1, "gads:server_transaction_source:list", "Network");

    /* renamed from: q6 */
    public static final C5207iz<Boolean> f22607q6;

    /* renamed from: r */
    public static final C5207iz<Integer> f22608r = C5207iz.m25450g(1, "gads:video_stream_cache:connect_timeout_millis", 10000);

    /* renamed from: r0 */
    public static final C5207iz<Integer> f22609r0 = C5207iz.m25450g(1, "gads:show_interstitial_with_context:min_version", 204890000);

    /* renamed from: r1 */
    public static final C5207iz<Boolean> f22610r1;

    /* renamed from: r2 */
    public static final C5207iz<Long> f22611r2 = C5207iz.m25451h(1, "gads:parental_controls:timeout", 2000);

    /* renamed from: r3 */
    public static final C5207iz<Boolean> f22612r3;

    /* renamed from: r4 */
    public static final C5207iz<Integer> f22613r4 = C5207iz.m25450g(1, "gads:rewarded_precache_pool:ad_time_limit", 1200);

    /* renamed from: r5 */
    public static final C5207iz<Boolean> f22614r5;

    /* renamed from: r6 */
    public static final C5207iz<Boolean> f22615r6;

    /* renamed from: s */
    public static final C5207iz<String> f22616s = C5207iz.m25453j(1, "gads:video:metric_frame_hash_times", BuildConfig.FLAVOR);

    /* renamed from: s0 */
    public static final C5207iz<Boolean> f22617s0;

    /* renamed from: s1 */
    public static final C5207iz<Boolean> f22618s1;

    /* renamed from: s2 */
    public static final C5207iz<Boolean> f22619s2;

    /* renamed from: s3 */
    public static final C5207iz<Boolean> f22620s3;

    /* renamed from: s4 */
    public static final C5207iz<Integer> f22621s4 = C5207iz.m25450g(1, "gads:interstitial_precache_pool:ad_time_limit", 1200);

    /* renamed from: s5 */
    public static final C5207iz<Boolean> f22622s5;

    /* renamed from: s6 */
    public static final C5207iz<Boolean> f22623s6;

    /* renamed from: t */
    public static final C5207iz<Long> f22624t = C5207iz.m25451h(1, "gads:video:metric_frame_hash_time_leniency", 500);

    /* renamed from: t0 */
    public static final C5207iz<Boolean> f22625t0;

    /* renamed from: t1 */
    public static final C5207iz<Boolean> f22626t1;

    /* renamed from: t2 */
    public static final C5207iz<Boolean> f22627t2;

    /* renamed from: t3 */
    public static final C5207iz<Boolean> f22628t3;

    /* renamed from: t4 */
    public static final C5207iz<String> f22629t4 = C5207iz.m25453j(1, "gads:rewarded_precache_pool:schema", "customTargeting,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");

    /* renamed from: t5 */
    public static final C5207iz<Integer> f22630t5 = C5207iz.m25450g(1, "gads:ad_error_api:min_version", 202006000);

    /* renamed from: t6 */
    public static final C5207iz<Boolean> f22631t6;

    /* renamed from: u */
    public static final C5207iz<Boolean> f22632u;

    /* renamed from: u0 */
    public static final C5207iz<Boolean> f22633u0;

    /* renamed from: u1 */
    public static final C5207iz<Boolean> f22634u1;

    /* renamed from: u2 */
    public static final C5207iz<Boolean> f22635u2;

    /* renamed from: u3 */
    public static final C5207iz<Integer> f22636u3 = C5207iz.m25450g(1, "gads:nonagon:request_timeout:seconds", 60);

    /* renamed from: u4 */
    public static final C5207iz<String> f22637u4 = C5207iz.m25453j(1, "gads:interstitial_precache_pool:schema", "customTargeting,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");

    /* renamed from: u5 */
    public static final C5207iz<Boolean> f22638u5;

    /* renamed from: u6 */
    public static final C5207iz<Integer> f22639u6 = C5207iz.m25450g(1, "gads:msa:visminalpha", 90);

    /* renamed from: v */
    public static final C5207iz<Long> f22640v = C5207iz.m25451h(1, "gads:video:surface_update_min_spacing_ms", 1000);

    /* renamed from: v0 */
    public static final C5207iz<Boolean> f22641v0;

    /* renamed from: v1 */
    public static final C5207iz<Boolean> f22642v1;

    /* renamed from: v2 */
    public static final C5207iz<Long> f22643v2 = C5207iz.m25451h(1, "gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30));

    /* renamed from: v3 */
    public static final C5207iz<Boolean> f22644v3;

    /* renamed from: v4 */
    public static final C5207iz<String> f22645v4 = C5207iz.m25453j(1, "gads:app_open_precache_pool:schema", "orientation,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");

    /* renamed from: v5 */
    public static final C5207iz<Boolean> f22646v5;

    /* renamed from: v6 */
    public static final C5207iz<Boolean> f22647v6;

    /* renamed from: w */
    public static final C5207iz<Boolean> f22648w;

    /* renamed from: w0 */
    public static final C5207iz<String> f22649w0 = C5207iz.m25453j(1, "gads:webview_cookie_url", "googleads.g.doubleclick.net");

    /* renamed from: w1 */
    public static final C5207iz<Boolean> f22650w1;

    /* renamed from: w2 */
    public static final C5207iz<Boolean> f22651w2;

    /* renamed from: w3 */
    public static final C5207iz<Boolean> f22652w3;

    /* renamed from: w4 */
    public static final C5207iz<String> f22653w4 = C5207iz.m25453j(1, "gads:app_open_precache_pool:discard_strategy", "oldest");

    /* renamed from: w5 */
    public static final C5207iz<Boolean> f22654w5;

    /* renamed from: w6 */
    public static final C5207iz<Boolean> f22655w6;

    /* renamed from: x */
    public static final C5207iz<Boolean> f22656x;

    /* renamed from: x0 */
    public static final C5207iz<Boolean> f22657x0;

    /* renamed from: x1 */
    public static final C5207iz<Boolean> f22658x1;

    /* renamed from: x2 */
    public static final C5207iz<Boolean> f22659x2;

    /* renamed from: x3 */
    public static final C5207iz<Boolean> f22660x3;

    /* renamed from: x4 */
    public static final C5207iz<Integer> f22661x4 = C5207iz.m25450g(1, "gads:app_open_precache_pool:count", 0);

    /* renamed from: x5 */
    public static final C5207iz<Integer> f22662x5 = C5207iz.m25450g(1, "gads:mediation_no_fill_error:min_version", 999999999);

    /* renamed from: x6 */
    public static final C5207iz<Boolean> f22663x6;

    /* renamed from: y */
    public static final C5207iz<Integer> f22664y = C5207iz.m25450g(1, "gads:video:spinner:scale", 4);

    /* renamed from: y0 */
    public static final C5207iz<Boolean> f22665y0;

    /* renamed from: y1 */
    public static final C5207iz<String> f22666y1 = C5207iz.m25453j(1, "gads:msa:experiments:incapi:trusted_cert", "308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a");

    /* renamed from: y2 */
    public static final C5207iz<Long> f22667y2 = C5207iz.m25451h(1, "gads:cache:connection_timeout", 5000);

    /* renamed from: y3 */
    public static final C5207iz<Boolean> f22668y3;

    /* renamed from: y4 */
    public static final C5207iz<String> f22669y4 = C5207iz.m25453j(1, "gads:app_open_precache_pool:cache_start_trigger", "onAdClosed");

    /* renamed from: y5 */
    public static final C5207iz<Boolean> f22670y5;

    /* renamed from: y6 */
    public static final C5207iz<Boolean> f22671y6;

    /* renamed from: z */
    public static final C5207iz<Long> f22672z = C5207iz.m25451h(1, "gads:video:spinner:jank_threshold_ms", 50);

    /* renamed from: z0 */
    public static final C5207iz<Long> f22673z0 = C5207iz.m25451h(1, "gads:app_activity_tracker:notify_background_listeners_delay_ms", 500);

    /* renamed from: z1 */
    public static final C5207iz<String> f22674z1 = C5207iz.m25453j(1, "gads:msa:experiments:incapi:debug_cert", "308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b");

    /* renamed from: z2 */
    public static final C5207iz<Long> f22675z2 = C5207iz.m25451h(1, "gads:cache:read_only_connection_timeout", 5000);

    /* renamed from: z3 */
    public static final C5207iz<String> f22676z3 = C5207iz.m25453j(1, "gads:uri_query_to_map_bg_thread:types", "/result");

    /* renamed from: z4 */
    public static final C5207iz<Integer> f22677z4 = C5207iz.m25450g(1, "gads:app_open_precache_pool:size", 1);

    /* renamed from: z5 */
    public static final C5207iz<Integer> f22678z5 = C5207iz.m25450g(1, "gads:offline_database_version:version", 1);

    /* renamed from: z6 */
    public static final C5207iz<Integer> f22679z6 = C5207iz.m25450g(1, "gads:timeout_for_show_call_succeed:ms", 3000);

    static {
        C5207iz.m25453j(1, "gads:active_view_location:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");
        t00<Boolean> t00 = k10.f18713c;
        C5207iz.m25450g(1, "gads:http_url_connection_factory:timeout_millis", 10000);
        Boolean bool = Boolean.TRUE;
        f22544j = C5207iz.m25452i(1, "gads:video_exo_player:fmp4_extractor_enabled", bool);
        Boolean bool2 = Boolean.FALSE;
        f22552k = C5207iz.m25452i(1, "gads:video_exo_player:use_play_back_info_for_should_start_play_back", bool2);
        f22560l = C5207iz.m25452i(1, "gads:video_exo_player:treat_load_exception_as_non_fatal", bool);
        f22632u = C5207iz.m25452i(1, "gads:video:force_watermark", bool2);
        f22648w = C5207iz.m25452i(1, "gads:video:spinner:enabled", bool2);
        f22656x = C5207iz.m25452i(1, "gads:video:shutter:enabled", bool2);
        f22282A = C5207iz.m25452i(1, "gads:video:aggressive_media_codec_release", bool2);
        f22290B = C5207iz.m25452i(1, "gads:memory_bundle:debug_info", bool2);
        f22346I = C5207iz.m25452i(1, "gads:mraid:expanded_interstitial_fix", bool2);
        f22353J = C5207iz.m25452i(1, "gads:mraid:initial_size_fallback", bool2);
        f22395P = C5207iz.m25452i(1, "gads:content_fetch_disable_get_title_from_webview", bool2);
        f22402Q = C5207iz.m25452i(1, "gads:content_fetch_enable_new_content_score", bool2);
        f22409R = C5207iz.m25452i(1, "gads:content_fetch_enable_serve_once", bool2);
        f22416S = C5207iz.m25452i(1, "gads:sai:enabled", bool);
        f22437V = C5207iz.m25452i(1, "gads:sai:using_macro:enabled", bool2);
        f22465Z = C5207iz.m25452i(1, "gads:sai:app_measurement_enabled3", bool2);
        f22481b0 = C5207iz.m25452i(1, "gads:sai:force_through_reflection", bool);
        f22489c0 = C5207iz.m25452i(1, "gads:sai:gmscore_availability_check_disabled", bool2);
        f22497d0 = C5207iz.m25452i(1, "gads:sai:logging_disabled_for_drx", bool2);
        f22505e0 = C5207iz.m25452i(1, "gads:sai:app_measurement_npa_enabled", bool2);
        f22513f0 = C5207iz.m25452i(1, "gads:idless:idless_disables_attestation", bool);
        f22521g0 = C5207iz.m25452i(1, "gads:idless:app_measurement_idless_enabled", bool);
        f22529h0 = C5207iz.m25452i(1, "gads:sai:server_side_npa:disable_writing", bool2);
        f22537i0 = C5207iz.m25452i(1, "gads:sai:server_side_npa:enabled", bool2);
        C5207iz.m25451h(1, "gads:sai:server_side_npa:ttl", TimeUnit.DAYS.toMillis(90));
        f22553k0 = C5207iz.m25452i(1, "gads:idless:internal_state_enabled", bool);
        f22561l0 = C5207iz.m25452i(1, "gads:idless:idless_disables_offline_ads_signalling", bool);
        f22569m0 = C5207iz.m25452i(1, "gads:custom_idless:enabled", bool2);
        C5207iz.m25452i(1, "gads:tfcd_deny_ad_storage:enabled", bool2);
        C5207iz.m25452i(1, "gads:tfua_deny_ad_storage:enabled", bool2);
        f22585o0 = C5207iz.m25452i(1, "gads:interstitial:app_must_be_foreground:enabled", bool2);
        f22593p0 = C5207iz.m25452i(1, "gads:interstitial:foreground_report:enabled", bool2);
        f22601q0 = C5207iz.m25452i(1, "gads:interstitial:default_immersive", bool2);
        f22617s0 = C5207iz.m25452i(1, "gads:webview:error_web_response:enabled", bool2);
        f22625t0 = C5207iz.m25452i(1, "gads:webview:set_fixed_text_zoom", bool);
        f22633u0 = C5207iz.m25452i(1, "gads:webviewgone:kill_process:enabled", bool2);
        f22641v0 = C5207iz.m25452i(1, "gads:webviewgone:new_onshow:enabled", bool2);
        C5207iz.m25452i(1, "gads:new_rewarded_ad:enabled", bool);
        f22657x0 = C5207iz.m25452i(1, "gads:rewarded:adapter_initialization_enabled", bool2);
        f22665y0 = C5207iz.m25452i(1, "gads:rewarded:ad_metadata_enabled", bool2);
        f22291B0 = C5207iz.m25452i(1, "gads:adid_values_in_adrequest:enabled", bool2);
        f22307D0 = C5207iz.m25452i(1, "gads:disable_adid_values_in_ms", bool2);
        f22323F0 = C5207iz.m25452i(1, "gads:custom_close_blocking:enabled", bool2);
        f22331G0 = C5207iz.m25452i(1, "gads:disabling_closable_area:enabled", bool2);
        f22339H0 = C5207iz.m25452i(1, "gads:force_top_right_close_button:enabled", bool2);
        f22361K0 = C5207iz.m25452i(1, "gads:disable_click_during_fade_in", bool2);
        f22368L0 = C5207iz.m25452i(1, "gads:use_system_ui_for_fullscreen:enabled", bool2);
        f22375M0 = C5207iz.m25452i(1, "gads:ad_overlay:collect_cutout_info:enabled", bool2);
        f22396P0 = C5207iz.m25452i(1, "gads:include_local_global_rectangles", bool2);
        f22417S0 = C5207iz.m25452i(1, "gads:position_watcher:enable_scroll_aware_ads", bool2);
        f22424T0 = C5207iz.m25452i(1, "gads:position_watcher:send_scroll_data", bool2);
        C5207iz.m25452i(1, "gads:gen204_signals:enabled", bool2);
        f22452X0 = C5207iz.m25452i(1, "gads:presentation_error:urls_enabled", bool);
        f22459Y0 = C5207iz.m25452i(1, "gads:rtb_interstitial:use_fullscreen_monitor", bool);
        f22466Z0 = C5207iz.m25452i(1, "gads:native_required_assets:enabled", bool2);
        f22474a1 = C5207iz.m25452i(1, "gads:native_required_assets:check_inner_mediaview:enabled", bool);
        f22490c1 = C5207iz.m25452i(1, "gads:track_view_next_runloop:enabled", bool2);
        f22498d1 = C5207iz.m25452i(1, "gads:synchronize_measurement_listener:enabled", bool2);
        f22506e1 = C5207iz.m25452i(1, "gads:native_required_assets:viewability:enabled", bool2);
        f22514f1 = C5207iz.m25452i(1, "gads:signal_adapters:enabled", bool2);
        f22546j1 = C5207iz.m25452i(1, "gads:additional_video_csi:enabled", bool2);
        f22554k1 = C5207iz.m25452i(1, "gads:using_official_simple_exoplayer:enabled", bool2);
        f22562l1 = C5207iz.m25452i(1, "gads:multiple_video_playback:enabled", bool2);
        f22570m1 = C5207iz.m25452i(1, "gads:run_exoplayer_video_stream_task_in_ui_thread:enabled", bool2);
        f22578n1 = C5207iz.m25452i(1, "gads:csi:enabled_per_sampling", bool2);
        f22586o1 = C5207iz.m25452i(1, "gads:always_set_transfer_listener:enabled", bool2);
        f22594p1 = C5207iz.m25452i(1, "gads:initialization_csi:enabled", bool2);
        C5207iz.m25452i(1, "gads:msa:experiments:enabled", bool2);
        f22602q1 = C5207iz.m25452i(1, "gads:msa:experiments:ps:enabled", bool);
        f22610r1 = C5207iz.m25452i(1, "gads:msa:experiments:fb:enabled", bool);
        f22618s1 = C5207iz.m25452i(1, "gads:msa:experiments:ps:er", bool);
        C5207iz.m25450g(1, "gads:gestures:a2:enabled", 0);
        f22626t1 = C5207iz.m25452i(1, "gads:msa:experiments:a2", bool2);
        f22634u1 = C5207iz.m25452i(1, "gads:msa:experiments:log", bool2);
        f22642v1 = C5207iz.m25452i(1, "gads:msa:experiments:vfb", bool);
        f22650w1 = C5207iz.m25452i(1, "gads:msa:experiments:incapi:enabled", bool2);
        f22658x1 = C5207iz.m25452i(1, "gads:msa:experiments:incapigass:enabled", bool2);
        f22284A1 = C5207iz.m25452i(1, "gads:gestures:clearTd:enabled", bool2);
        f22300C1 = C5207iz.m25452i(1, "gads:gestures:errorlogging:enabled", bool2);
        f22316E1 = C5207iz.m25452i(1, "gads:gestures:asig:enabled", bool2);
        f22324F1 = C5207iz.m25452i(1, "gads:gestures:ans:enabled", bool2);
        f22332G1 = C5207iz.m25452i(1, "gads:gestures:tos:enabled", bool2);
        C5207iz.m25452i(1, "gads:gestures:brt:enabled", bool);
        f22340H1 = C5207iz.m25452i(1, "gads:gestures:fpi:enabled", bool2);
        f22348I1 = C5207iz.m25452i(1, "gads:signal:app_permissions:disabled", bool2);
        f22355J1 = C5207iz.m25452i(1, "gads:signal:app_set_id_info_in_ad_request:enabled", bool2);
        f22362K1 = C5207iz.m25452i(1, "gads:gestures:hpk:enabled", bool);
        f22376M1 = C5207iz.m25452i(1, "gads:gestures:bs:enabled", bool);
        f22383N1 = C5207iz.m25452i(1, "gads:gestures:check_initialization_thread:enabled", bool2);
        f22390O1 = C5207iz.m25452i(1, "gads:gestures:init_new_thread:enabled", bool);
        f22397P1 = C5207iz.m25452i(1, "gads:gestures:pds:enabled", bool);
        C5207iz.m25450g(1, "gads:gestures:as2percentage", 0);
        f22404Q1 = C5207iz.m25452i(1, "gads:gestures:ns:enabled", bool);
        f22411R1 = C5207iz.m25452i(1, "gads:gestures:vdd:enabled", bool2);
        f22418S1 = C5207iz.m25452i(1, "gads:gadsignalsdelegate_ui_thread_fix:enabled", bool2);
        f22425T1 = C5207iz.m25452i(1, "gads:native:asset_view_touch_events", bool2);
        f22432U1 = C5207iz.m25452i(1, "gads:native:set_touch_listener_on_asset_views", bool);
        f22439V1 = C5207iz.m25452i(1, "gads:ais:enabled", bool);
        f22446W1 = C5207iz.m25452i(1, "gads:stav:enabled", bool2);
        f22453X1 = C5207iz.m25452i(1, "gads:spam:impression_ui_idle:enable", bool2);
        C5207iz.m25454k(1, "gads:sdk_core_constants:experiment_id");
        C5207iz.m25452i(1, "gads:js_flags:disable_phenotype", bool2);
        f22499d2 = C5207iz.m25452i(1, "gads:native:get_native_ad_view_signals", bool2);
        f22523g2 = C5207iz.m25452i(1, "gads:enable_singleton_broadcast_receiver", bool2);
        f22531h2 = C5207iz.m25452i(1, "gads:native:media_view_match_parent:enabled", bool);
        f22539i2 = C5207iz.m25452i(1, "gads:video:restrict_inside_web_view:enabled", bool2);
        f22547j2 = C5207iz.m25452i(1, "gads:native:count_impression_for_assets", bool2);
        f22555k2 = C5207iz.m25452i(1, "gads:native:enable_enigma_watermarking", bool2);
        f22563l2 = C5207iz.m25452i(1, "gads:fluid_ad:use_wrap_content_height", bool2);
        f22571m2 = C5207iz.m25452i(1, "gads:rtb_v1_1:fetch_app_settings_using_cld:enabled", bool);
        f22579n2 = C5207iz.m25452i(1, "gads:get_request_signals_cld:enabled", bool);
        f22587o2 = C5207iz.m25452i(1, "gads:get_request_signals_common_cld:enabled", bool);
        f22595p2 = C5207iz.m25452i(1, "gads:rtb_v1_1:use_manifest_appid_cld:enabled", bool);
        String str = "(?!)";
        C5207iz.m25450g(1, "gads:cache:ad_request_timeout_millis", C0885l.C0891f.DEFAULT_SWIPE_ANIMATION_DURATION);
        C5207iz.m25450g(1, "gads:cache:max_concurrent_downloads", 10);
        C5207iz.m25452i(1, "gads:cache:downloader_use_high_priority", bool2);
        C5207iz.m25451h(1, "gads:cache:javascript_timeout_millis", 5000);
        f22619s2 = C5207iz.m25452i(1, "gads:cache:bind_on_foreground", bool2);
        f22627t2 = C5207iz.m25452i(1, "gads:cache:bind_on_init", bool2);
        f22635u2 = C5207iz.m25452i(1, "gads:cache:bind_on_request", bool2);
        f22651w2 = C5207iz.m25452i(1, "gads:cache:use_cache_data_source", bool2);
        f22659x2 = C5207iz.m25452i(1, "gads:cache:connection_per_read", bool2);
        f22285A2 = C5207iz.m25452i(1, "gads:cache:read_inner_data_source_if_gcache_miss", bool2);
        f22293B2 = C5207iz.m25452i(1, "gads:cache:read_inner_data_source_if_gcache_not_downloaded", bool2);
        C5207iz.m25452i(1, "gads:cache:function_call_timeout_v1:enabled", bool2);
        C5207iz.m25451h(1, "gads:cache:function_call_timeout", 5000);
        C5207iz.m25452i(1, "gads:cache:add_itag_to_cache_key:enabled", bool2);
        f22301C2 = C5207iz.m25452i(1, "gads:http_assets_cache:enabled", bool2);
        f22325F2 = C5207iz.m25452i(1, "gads:chrome_custom_tabs_browser:enabled", bool2);
        f22333G2 = C5207iz.m25452i(1, "gads:chrome_custom_tabs:disabled", bool2);
        f22341H2 = C5207iz.m25452i(1, "gads:chrome_custom_tabs_browser_v2:enabled", bool2);
        f22349I2 = C5207iz.m25452i(1, "gads:cct_v2_connection:enabled", bool2);
        f22356J2 = C5207iz.m25452i(1, "gads:cct_v2_direct_launch:enabled", bool2);
        f22363K2 = C5207iz.m25452i(1, "gads:chrome_custom_tabs_for_native_ads:enabled", bool2);
        f22370L2 = C5207iz.m25452i(1, "gad:cct_v2_beta:enabled", bool2);
        f22384N2 = C5207iz.m25452i(2, "CHROME_CUSTOM_TAB_OPT_OUT", bool2);
        f22440V2 = C5207iz.m25452i(1, "gad:interstitial_notify_publisher_without_delay", bool2);
        f22447W2 = C5207iz.m25452i(1, "gad:interstitial_for_multi_window", bool2);
        f22454X2 = C5207iz.m25452i(1, "gad:interstitial_ad_stay_active_in_multi_window", bool2);
        f22461Y2 = C5207iz.m25452i(1, "gad:interstitial_multi_window_method", bool2);
        f22476a3 = C5207iz.m25452i(1, "gads:clearcut_logging:enabled", bool2);
        f22484b3 = C5207iz.m25452i(1, "gads:clearcut_logging:write_to_file", bool2);
        f22492c3 = C5207iz.m25452i(1, "gad:publisher_testing:force_local_request:enabled", bool);
        f22524g3 = C5207iz.m25452i(1, "gads:omid:enabled", bool);
        f22540i3 = C5207iz.m25452i(1, "gads:omid_use_admob_impl_dependency:enabled", bool2);
        f22548j3 = C5207iz.m25452i(1, "gads:omid_use_base_64_encoding_for_native_html:enabled", bool2);
        C5207iz.m25452i(1, "gads:nonagon:banner:enabled", bool);
        C5207iz.m25453j(1, "gads:nonagon:banner:ad_unit_exclusions", str);
        C5207iz.m25452i(1, "gads:nonagon:app_open:enabled", bool);
        f22572m3 = C5207iz.m25452i(1, "gads:nonagon:app_open_app_switch_signal:enabled", bool2);
        C5207iz.m25453j(1, "gads:nonagon:app_open:ad_unit_exclusions", str);
        C5207iz.m25452i(1, "gads:nonagon:interstitial:enabled", bool);
        C5207iz.m25453j(1, "gads:nonagon:interstitial:ad_unit_exclusions", str);
        C5207iz.m25452i(1, "gads:nonagon:rewardedvideo:enabled", bool);
        f22580n3 = C5207iz.m25452i(1, "gads:nonagon:mobile_ads_setting_manager:enabled", bool);
        f22588o3 = C5207iz.m25453j(1, "gads:nonagon:rewardedvideo:ad_unit_exclusions", str);
        f22596p3 = C5207iz.m25452i(1, "gads:nonagon:banner:check_dp_size", bool);
        f22604q3 = C5207iz.m25452i(1, "gads:nonagon:rewarded:load_multiple_ads", bool);
        f22612r3 = C5207iz.m25452i(1, "gads:nonagon:return_no_fill_error_code", bool2);
        f22620s3 = C5207iz.m25452i(1, "gads:nonagon:continue_on_no_fill", bool2);
        f22628t3 = C5207iz.m25452i(1, "gads:nonagon:separate_timeout:enabled", bool);
        f22644v3 = C5207iz.m25452i(1, "gads:nonagon:banner_recursive_renderer", bool2);
        f22652w3 = C5207iz.m25452i(1, "gads:nonagon:app_stats_lock:enabled", bool2);
        f22660x3 = C5207iz.m25452i(1, "gads:nonagon:app_stats_main_thread:enabled", bool2);
        f22668y3 = C5207iz.m25452i(1, "gads:uri_query_to_map_bg_thread:enabled", bool2);
        f22294B3 = C5207iz.m25452i(1, "gads:nonagon:active_view_gmsg_background_thread:enabled", bool);
        f22302C3 = C5207iz.m25452i(1, "gads:active_view_gmsg_separate_pool:enabled", bool);
        f22310D3 = C5207iz.m25452i(1, "gads:active_view_audio_signal_audio_mode:enabled", bool2);
        f22318E3 = C5207iz.m25452i(1, "gads:signals:ad_id_info:enabled", bool2);
        f22326F3 = C5207iz.m25452i(1, "gads:signals:app_index:enabled", bool2);
        f22334G3 = C5207iz.m25452i(1, "gads:signals:attestation_token:enabled", bool2);
        f22342H3 = C5207iz.m25452i(1, "gads:signals:cache:enabled", bool2);
        C5207iz.m25452i(1, "gads:signals:doritos:enabled", bool2);
        f22350I3 = C5207iz.m25452i(1, "gads:signals:doritos:v1:enabled", bool2);
        C5207iz.m25452i(1, "gads:signals:doritos:v2:immediate:enabled", bool2);
        f22357J3 = C5207iz.m25452i(1, "gads:signals:parental_control:enabled", bool2);
        f22364K3 = C5207iz.m25452i(1, "gads:signals:video_decoder:enabled", bool2);
        f22371L3 = C5207iz.m25452i(1, "gads:signals:banner_hardware_acceleration:enabled", bool2);
        f22378M3 = C5207iz.m25452i(1, "gads:signals:native_hardware_acceleration:enabled", bool2);
        C5207iz.m25452i(1, "gads:attestation_token:enabled", bool2);
        f22420S3 = C5207iz.m25452i(1, "gads:consent:shared_preference_reading:enabled", bool);
        f22427T3 = C5207iz.m25452i(1, "gads:consent:iab_consent_info:enabled", bool);
        f22434U3 = C5207iz.m25452i(1, "gads:fc_consent:shared_preference_reading:enabled", bool);
        f22448W3 = C5207iz.m25452i(1, "gads:nativeads:image:sample:enabled", bool);
        f22462Y3 = C5207iz.m25452i(1, "gads:nativeads:pub_image_scale_type:enabled", bool);
        f22469Z3 = C5207iz.m25452i(1, "gads:offline_signaling:enabled", bool2);
        f22485b4 = C5207iz.m25452i(1, "gads:nativeads:template_signal:enabled", bool);
        f22493c4 = C5207iz.m25452i(1, "gads:nativeads:media_content_aspect_ratio:enabled", bool);
        f22501d4 = C5207iz.m25452i(1, "gads:nativeads:media_content_metadata:enabled", bool);
        f22509e4 = C5207iz.m25452i(1, "gads:buffer_click_url_as_ready_to_ping:enabled", bool2);
        f22517f4 = C5207iz.m25452i(1, "gads:predictive_prefetch_from_cld:enabled", bool2);
        f22525g4 = C5207iz.m25452i(1, "gads:cache_layer_from_cld:enabled", bool2);
        f22533h4 = C5207iz.m25452i(1, "gads:cache_layer_wait_for_app_settings:enabled", bool2);
        f22541i4 = C5207iz.m25452i(1, "gads:precache_pool:verbose_logging", bool2);
        f22295B4 = C5207iz.m25452i(1, "gads:memory_leak:b129558083", bool2);
        f22303C4 = C5207iz.m25452i(1, "gads:unhandled_event_reporting:enabled", bool2);
        f22311D4 = C5207iz.m25452i(1, "gads:response_info:enabled", bool);
        f22319E4 = C5207iz.m25452i(1, "gads:csi:interstitial_failed_to_show:enabled", bool2);
        f22327F4 = C5207iz.m25452i(1, "gads:csi:mediation_failure:enabled", bool2);
        f22343H4 = C5207iz.m25452i(1, "gads:csi:eids_from_cld:enabled", bool2);
        f22351I4 = C5207iz.m25452i(1, "gads:request_id_check:enabled", bool2);
        f22358J4 = C5207iz.m25452i(1, "gads:request_id_int32:enabled", bool);
        f22365K4 = C5207iz.m25452i(1, "gads:render_decouple:enabled", bool);
        f22386N4 = C5207iz.m25452i(1, "gads:scar_csi:enabled", bool2);
        f22393O4 = C5207iz.m25452i(1, "gads:scar_signal_comparison_experiment:enabled", bool2);
        f22400P4 = C5207iz.m25452i(1, "gads:scar_signal_comparison_format:unknown", bool2);
        C5207iz.m25452i(1, "gads:scar_trustless_token_for_gbid:enabled", bool2);
        f22414R4 = C5207iz.m25452i(1, "gads:scar_v2:send_click_ping:enabled", bool2);
        f22421S4 = C5207iz.m25452i(1, "gads:scar_v2:send_impression_pings:enabled", bool2);
        f22428T4 = C5207iz.m25452i(1, "gads:scar_v2:user_agent:enabled", bool2);
        f22442V4 = C5207iz.m25452i(1, "gads:scar_v2:prior_click_count:enabled", bool2);
        f22463Y4 = C5207iz.m25452i(1, "gads:signal_collection_without_rendering:enabled", bool);
        f22478a5 = C5207iz.m25452i(2, "DISABLE_CRASH_REPORTING", bool2);
        f22486b5 = C5207iz.m25452i(1, "gads:paid_event_listener:enabled", bool);
        f22494c5 = C5207iz.m25452i(1, "gads:interscroller_ad:enabled", bool);
        f22502d5 = C5207iz.m25452i(1, "gads:interscroller_ad:refresh:enabled", bool2);
        C5207iz.m25450g(1, "gads:interscroller:min_width", 300);
        C5207iz.m25450g(1, "gads:interscroller:min_height", C0885l.C0891f.DEFAULT_SWIPE_ANIMATION_DURATION);
        f22510e5 = C5207iz.m25452i(1, "gads:is_in_scroll_view_new_api:enabled", bool);
        f22518f5 = C5207iz.m25452i(1, "gads:policy_validator_for_all_pubs:enabled", bool);
        f22542i5 = C5207iz.m25452i(2, "NATIVE_AD_DEBUGGER_ENABLED", bool);
        f22566l5 = C5207iz.m25452i(1, "gads:use_wide_viewport:enabled", bool2);
        f22574m5 = C5207iz.m25452i(1, "gads:load_with_overview_mode:enabled", bool2);
        f22582n5 = C5207iz.m25452i(1, "gads:wire_banner_listener_after_request:enabled", bool2);
        f22590o5 = C5207iz.m25452i(1, "gads:wire_app_open_listener_after_request:enabled", bool2);
        f22598p5 = C5207iz.m25452i(1, "gads:wire_interstitial_listener_after_request:enabled", bool2);
        f22614r5 = C5207iz.m25452i(1, "gads:can_open_app_and_open_app_action:enabled", bool2);
        f22622s5 = C5207iz.m25452i(1, "gads:open_gmsg:set_uri_data_and_type:enabled", bool2);
        f22638u5 = C5207iz.m25452i(1, "gads:forward_bow_error_string:enabled", bool);
        f22646v5 = C5207iz.m25452i(1, "gads:continue_on_process_response:enabled", bool2);
        f22654w5 = C5207iz.m25452i(1, "gads:mediation_status_reporting:enabled", bool);
        f22670y5 = C5207iz.m25452i(1, "gads:line_item_no_fill_conversion:enabled", bool2);
        f22288A5 = C5207iz.m25452i(1, "gads:offline_ads_notification:enabled", bool);
        f22296B5 = C5207iz.m25452i(1, "gads:use_new_network_api:enabled", bool);
        f22304C5 = C5207iz.m25452i(1, "gads:handle_click_recorded_event:enabled", bool2);
        f22312D5 = C5207iz.m25452i(1, "gads:default_network_type_fine_to_unknown:enabled", bool);
        f22320E5 = C5207iz.m25452i(1, "gads:handle_intent_async:enabled", bool);
        f22328F5 = C5207iz.m25452i(1, "gads:skip_deep_link_validation_native_ads:enabled", bool);
        f22336G5 = C5207iz.m25452i(1, "gads:try_deep_link_fallback_native_ads:enabled", bool);
        f22344H5 = C5207iz.m25452i(1, "gads:in_app_link_handling_for_android_11_enabled:enabled", bool);
        f22352I5 = C5207iz.m25452i(1, "gads:new_remote_logging_utils:enabled", bool2);
        f22359J5 = C5207iz.m25452i(1, "gads:remote_logging:enabled", bool2);
        f22408Q5 = C5207iz.m25452i(1, "gads:hide_grey_title_bar:enabled", bool2);
        f22415R5 = C5207iz.m25452i(1, "gads:interstitial_ad_parameter_handler:enabled", bool);
        f22422S5 = C5207iz.m25452i(1, "gads:inspector:enabled", bool);
        f22450W5 = C5207iz.m25452i(1, "gads:inspector:shake_enabled", bool);
        f22487b6 = C5207iz.m25452i(1, "gads:inspector:flick_enabled", bool);
        f22535h6 = C5207iz.m25452i(1, "gads:inspector:ad_manager_enabled", bool);
        f22543i6 = C5207iz.m25452i(1, "gads:inspector:policy_violations_enabled", bool2);
        f22551j6 = C5207iz.m25452i(1, "gads:inspector:bidding_data_enabled", bool);
        f22559k6 = C5207iz.m25452i(1, "gads:paw_register_webview:enabled", bool);
        f22567l6 = C5207iz.m25452i(1, "gads:paw_webview_early_initialization:enabled", bool2);
        f22575m6 = C5207iz.m25452i(1, "gads:h5ads:enabled", bool);
        C5207iz.m25450g(1, "gads:h5ads:max_gmsg_length", 5000);
        f22599p6 = C5207iz.m25452i(1, "gads:native_html_video_asset:enabled", bool);
        f22607q6 = C5207iz.m25452i(1, "gads:native_html_image_asset:enabled", bool);
        C5207iz.m25452i(1, "gads:leibniz:events:enabled", bool2);
        f22615r6 = C5207iz.m25452i(1, "gads:msa:alphavis_enabled", bool2);
        f22623s6 = C5207iz.m25452i(1, "gads:msa:adutilalphavis_enabled", bool2);
        f22631t6 = C5207iz.m25452i(1, "gads:msa:nativealphavis_enabled", bool2);
        f22647v6 = C5207iz.m25452i(1, "gads:msa:vswfl", bool2);
        f22655w6 = C5207iz.m25452i(1, "gads:msa:poslogger", bool2);
        f22663x6 = C5207iz.m25452i(1, "gads:new_dynamite_module_method:enabled", bool2);
        f22671y6 = C5207iz.m25452i(1, "gads:new_show_failure_coverage:enabled", bool2);
        f22289A6 = C5207iz.m25452i(1, "gads:read_pub_callback_param_open_gmsg:enabled", bool);
        f22297B6 = C5207iz.m25452i(1, "gads:read_pub_callback_param_click_gmsg:enabled", bool);
        f22305C6 = C5207iz.m25452i(1, "gads:forward_physical_click_to_ad_listener:enabled", bool);
        f22313D6 = C5207iz.m25452i(1, "gads:webview_destroy_workaround:enabled", bool);
        f22321E6 = C5207iz.m25452i(1, "gads:appstate_getresource_fix:enabled", bool2);
        f22329F6 = C5207iz.m25452i(1, "gads:convert_ad_unit_lower_case_rtb:enabled", bool2);
        f22337G6 = C5207iz.m25452i(1, "gads:drx_ad_unit_regex_case_insensitive:enabled", bool2);
        f22345H6 = C5207iz.m25452i(1, "gads:csi_ping_for_invalid_dynamite_flags_access:enabled", bool2);
    }

    /* renamed from: a */
    public static List<String> m29788a() {
        return C5054ev.m23223a().mo18769a();
    }

    /* renamed from: b */
    public static List<String> m29789b() {
        return C5054ev.m23223a().mo18770b();
    }

    /* renamed from: c */
    public static void m29790c(Context context) {
        C5577sz.m31001a(new C5466pz(context));
    }

    /* renamed from: d */
    public static void m29791d(Context context, int i, JSONObject jSONObject) {
        C5054ev.m23224b();
        SharedPreferences.Editor edit = C5281kz.m26484a(context).edit();
        C5054ev.m23223a();
        t00<Boolean> t00 = x00.f25610a;
        C5054ev.m23223a().mo18773e(edit, 1, jSONObject);
        C5054ev.m23224b();
        edit.commit();
    }
}
