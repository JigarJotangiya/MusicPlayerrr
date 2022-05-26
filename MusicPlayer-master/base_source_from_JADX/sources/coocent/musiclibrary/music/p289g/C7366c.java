package coocent.musiclibrary.music.p289g;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: coocent.musiclibrary.music.g.c */
/* compiled from: PermissionUtils */
public class C7366c {

    /* renamed from: a */
    private static Context f32433a;

    /* renamed from: b */
    private static SharedPreferences f32434b;

    /* renamed from: c */
    private static ArrayList<C7365b> f32435c = new ArrayList<>();

    /* renamed from: d */
    public static String f32436d = "android.permission.WRITE_EXTERNAL_STORAGE";

    /* renamed from: a */
    public static void m41589a(Activity activity, String str, C7364a aVar) {
        m41590b(activity, new String[]{str}, aVar);
    }

    /* renamed from: b */
    public static void m41590b(Activity activity, String[] strArr, C7364a aVar) {
        if (aVar != null) {
            if (m41594f(activity, strArr)) {
                aVar.mo26654T0();
                return;
            }
            C7365b bVar = new C7365b(new ArrayList(Arrays.asList(strArr)), aVar);
            f32435c.add(bVar);
            activity.requestPermissions(strArr, bVar.mo28123b());
        }
    }

    /* renamed from: c */
    public static void m41591c(Activity activity, C7364a aVar) {
        if (m41592d(f32436d)) {
            aVar.mo26651Q0();
        } else {
            m41589a(activity, f32436d, aVar);
        }
    }

    /* renamed from: d */
    public static boolean m41592d(String str) {
        Context context = f32433a;
        if (context != null) {
            return context.checkSelfPermission(str) == 0;
        }
        throw new RuntimeException("Before comparing permissions you need to call PermissionUtils.init(context)");
    }

    /* renamed from: e */
    public static ArrayList<String> m41593e() {
        if (f32433a != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList<String> arrayList2 = new ArrayList<>();
            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
            arrayList.add("android.permission.WRITE_CALENDAR");
            arrayList.add("android.permission.READ_CALENDAR");
            arrayList.add("android.permission.CAMERA");
            arrayList.add("android.permission.WRITE_CONTACTS");
            arrayList.add("android.permission.READ_CONTACTS");
            arrayList.add("android.permission.GET_ACCOUNTS");
            arrayList.add("android.permission.RECORD_AUDIO");
            arrayList.add("android.permission.CALL_PHONE");
            arrayList.add("android.permission.READ_PHONE_STATE");
            int i = Build.VERSION.SDK_INT;
            if (i >= 16) {
                arrayList.add("android.permission.READ_CALL_LOG");
            }
            if (i >= 16) {
                arrayList.add("android.permission.WRITE_CALL_LOG");
            }
            arrayList.add("com.android.voicemail.permission.ADD_VOICEMAIL");
            arrayList.add("android.permission.USE_SIP");
            arrayList.add("android.permission.PROCESS_OUTGOING_CALLS");
            if (i >= 20) {
                arrayList.add("android.permission.BODY_SENSORS");
            }
            arrayList.add("android.permission.SEND_SMS");
            arrayList.add("android.permission.READ_SMS");
            arrayList.add("android.permission.RECEIVE_SMS");
            arrayList.add("android.permission.RECEIVE_WAP_PUSH");
            arrayList.add("android.permission.RECEIVE_MMS");
            if (i >= 16) {
                arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
            }
            arrayList.add(f32436d);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (f32433a.checkSelfPermission(str) == 0) {
                    arrayList2.add(str);
                }
            }
            return arrayList2;
        }
        throw new RuntimeException("Must call init() earlier");
    }

    /* renamed from: f */
    public static boolean m41594f(Activity activity, String[] strArr) {
        for (String checkSelfPermission : strArr) {
            if (activity.checkSelfPermission(checkSelfPermission) != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static void m41595g(Context context) {
        f32434b = context.getSharedPreferences("pl.tajchert.runtimepermissionhelper", 0);
        f32433a = context;
        if (Build.VERSION.SDK_INT >= 30) {
            f32436d = "android.permission.READ_EXTERNAL_STORAGE";
        } else {
            f32436d = "android.permission.WRITE_EXTERNAL_STORAGE";
        }
    }

    /* renamed from: h */
    public static void m41596h(int i, String[] strArr, int[] iArr) {
        C7365b bVar = new C7365b(i);
        if (f32435c.contains(bVar)) {
            ArrayList<C7365b> arrayList = f32435c;
            C7365b bVar2 = arrayList.get(arrayList.indexOf(bVar));
            if (m41599k(iArr)) {
                bVar2.mo28122a().mo26654T0();
            } else {
                bVar2.mo28122a().mo26642C();
            }
            f32435c.remove(bVar);
        }
        m41597i();
    }

    /* renamed from: i */
    public static void m41597i() {
        ArrayList<String> e = m41593e();
        HashSet hashSet = new HashSet();
        Iterator<String> it = e.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next());
        }
        f32434b.edit().putStringSet("previous_permissions", hashSet).apply();
    }

    /* renamed from: j */
    public static boolean m41598j(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    /* renamed from: k */
    public static boolean m41599k(int[] iArr) {
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
