package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C3244f;
import com.google.android.gms.common.C3247i;
import com.google.android.gms.common.p078l.C3334c;
import com.google.android.gms.common.util.C3363h;
import java.util.Locale;
import p082e.p098e.C3478g;
import p082e.p109h.p115l.C3646c;
import p159f.p243f.p245b.p246a.p247a.C4861c;

/* renamed from: com.google.android.gms.common.internal.v */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3320v {

    /* renamed from: a */
    private static final C3478g<String, String> f10666a = new C3478g<>();

    /* renamed from: b */
    private static Locale f10667b;

    /* renamed from: a */
    public static String m14333a(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C4861c.common_google_play_services_install_title);
            case 2:
                return resources.getString(C4861c.common_google_play_services_update_title);
            case 3:
                return resources.getString(C4861c.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m14341i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m14341i(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m14341i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m14341i(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
        }
    }

    /* renamed from: b */
    public static String m14334b(Context context, int i) {
        String str;
        if (i == 6) {
            str = m14341i(context, "common_google_play_services_resolution_required_title");
        } else {
            str = m14333a(context, i);
        }
        return str == null ? context.getResources().getString(C4861c.common_google_play_services_notification_ticker) : str;
    }

    /* renamed from: c */
    public static String m14335c(Context context, int i) {
        Resources resources = context.getResources();
        String f = m14338f(context);
        if (i == 1) {
            return resources.getString(C4861c.common_google_play_services_install_text, new Object[]{f});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(C4861c.common_google_play_services_enable_text, new Object[]{f});
            } else if (i == 5) {
                return m14340h(context, "common_google_play_services_invalid_account_text", f);
            } else {
                if (i == 7) {
                    return m14340h(context, "common_google_play_services_network_error_text", f);
                }
                if (i == 9) {
                    return resources.getString(C4861c.common_google_play_services_unsupported_text, new Object[]{f});
                } else if (i == 20) {
                    return m14340h(context, "common_google_play_services_restricted_profile_text", f);
                } else {
                    switch (i) {
                        case 16:
                            return m14340h(context, "common_google_play_services_api_unavailable_text", f);
                        case 17:
                            return m14340h(context, "common_google_play_services_sign_in_failed_text", f);
                        case 18:
                            return resources.getString(C4861c.common_google_play_services_updating_text, new Object[]{f});
                        default:
                            return resources.getString(C3247i.common_google_play_services_unknown_issue, new Object[]{f});
                    }
                }
            }
        } else if (C3363h.m14457g(context)) {
            return resources.getString(C4861c.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(C4861c.common_google_play_services_update_text, new Object[]{f});
        }
    }

    /* renamed from: d */
    public static String m14336d(Context context, int i) {
        if (i == 6 || i == 19) {
            return m14340h(context, "common_google_play_services_resolution_required_text", m14338f(context));
        }
        return m14335c(context, i);
    }

    /* renamed from: e */
    public static String m14337e(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(C4861c.common_google_play_services_install_button);
        }
        if (i == 2) {
            return resources.getString(C4861c.common_google_play_services_update_button);
        }
        if (i != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(C4861c.common_google_play_services_enable_button);
    }

    /* renamed from: f */
    public static String m14338f(Context context) {
        String packageName = context.getPackageName();
        try {
            return C3334c.m14368a(context).mo11911d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: g */
    public static String m14339g(Context context) {
        return context.getResources().getString(C4861c.common_google_play_services_notification_channel_name);
    }

    /* renamed from: h */
    private static String m14340h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i = m14341i(context, str);
        if (i == null) {
            i = resources.getString(C3247i.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, i, new Object[]{str2});
    }

    /* renamed from: i */
    private static String m14341i(Context context, String str) {
        String str2;
        String str3;
        C3478g<String, String> gVar = f10666a;
        synchronized (gVar) {
            Locale c = C3646c.m15705a(context.getResources().getConfiguration()).mo12908c(0);
            if (!c.equals(f10667b)) {
                gVar.clear();
                f10667b = c;
            }
            String str4 = gVar.get(str);
            if (str4 != null) {
                return str4;
            }
            Resources d = C3244f.m14044d(context);
            if (d == null) {
                return null;
            }
            int identifier = d.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                if (str.length() != 0) {
                    str3 = "Missing resource: ".concat(str);
                } else {
                    str3 = new String("Missing resource: ");
                }
                Log.w("GoogleApiAvailability", str3);
                return null;
            }
            String string = d.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                if (str.length() != 0) {
                    str2 = "Got empty resource: ".concat(str);
                } else {
                    str2 = new String("Got empty resource: ");
                }
                Log.w("GoogleApiAvailability", str2);
                return null;
            }
            gVar.put(str, string);
            return string;
        }
    }
}
