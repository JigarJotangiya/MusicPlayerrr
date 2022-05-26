package com.coocent.musiccutter.ringtone;

import android.app.Application;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.coocent.musiccutter.ringtone.d */
/* compiled from: CheapSoundFile */
public class C2438d {

    /* renamed from: c */
    static C2439a[] f8562c = {C2428a.m11346D(), C2432b.m11378w(), C2435c.m11401v(), C2442e.m11447y()};

    /* renamed from: d */
    static Application f8563d;

    /* renamed from: e */
    static ArrayList<String> f8564e = new ArrayList<>();

    /* renamed from: f */
    static HashMap<String, C2439a> f8565f = new HashMap<>();

    /* renamed from: a */
    protected C2440b f8566a = null;

    /* renamed from: b */
    protected File f8567b = null;

    /* renamed from: com.coocent.musiccutter.ringtone.d$a */
    /* compiled from: CheapSoundFile */
    public interface C2439a {
        /* renamed from: b */
        String[] mo9483b();

        /* renamed from: c */
        C2438d mo9484c(Application application);
    }

    /* renamed from: com.coocent.musiccutter.ringtone.d$b */
    /* compiled from: CheapSoundFile */
    public interface C2440b {
        /* renamed from: a */
        boolean mo9404a(double d);
    }

    /* renamed from: com.coocent.musiccutter.ringtone.d$c */
    /* compiled from: CheapSoundFile */
    public interface C2441c {
        /* renamed from: a */
        void mo9411a();

        /* renamed from: b */
        void mo9412b(String str);
    }

    static {
        for (C2439a aVar : f8562c) {
            for (String str : aVar.mo9483b()) {
                f8564e.add(str);
                f8565f.put(str, aVar);
            }
        }
    }

    protected C2438d() {
    }

    /* renamed from: d */
    public static C2438d m11418d(Application application, String str, long j, C2440b bVar) throws IOException {
        C2439a aVar;
        if (application == null) {
            return null;
        }
        f8563d = application;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (file.exists()) {
            String[] split = file.getName().toLowerCase().split("\\.");
            if (split.length < 2 || (aVar = f8565f.get(split[split.length - 1])) == null) {
                return null;
            }
            C2438d c = aVar.mo9484c(application);
            c.mo9493s(bVar);
            c.mo9467a(file);
            return c;
        }
        throw new FileNotFoundException(str);
    }

    /* renamed from: e */
    public static boolean m11419e(String str) {
        try {
            String[] split = new File(str).getName().toLowerCase().split("\\.");
            if (split.length < 2) {
                return false;
            }
            return m11420f(split[split.length - 1]);
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: f */
    public static boolean m11420f(String str) {
        try {
            for (String equals : m11421p()) {
                if (TextUtils.equals(str, equals)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: p */
    public static String[] m11421p() {
        ArrayList<String> arrayList = f8564e;
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: q */
    public static String m11422q(String str) {
        try {
            String[] split = new File(str).getName().toLowerCase().split("\\.");
            if (split.length < 2) {
                return BuildConfig.FLAVOR;
            }
            return split[split.length - 1];
        } catch (Exception e) {
            e.printStackTrace();
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: a */
    public void mo9467a(File file) throws FileNotFoundException, IOException {
        this.f8567b = file;
    }

    /* renamed from: b */
    public void mo9468b(File file, int i, int i2) throws IOException {
        throw null;
    }

    /* renamed from: c */
    public void mo9469c(CharSequence charSequence, String str, long j, int i, int i2, int i3, C2441c cVar) throws IOException {
        throw null;
    }

    /* renamed from: g */
    public int mo9470g() {
        throw null;
    }

    /* renamed from: h */
    public String mo9471h() {
        throw null;
    }

    /* renamed from: i */
    public int[] mo9472i() {
        throw null;
    }

    /* renamed from: j */
    public int[] mo9473j() {
        throw null;
    }

    /* renamed from: k */
    public int[] mo9474k() {
        throw null;
    }

    /* renamed from: l */
    public int mo9475l() {
        throw null;
    }

    /* renamed from: m */
    public int mo9476m() {
        throw null;
    }

    /* renamed from: n */
    public int mo9477n() {
        throw null;
    }

    /* renamed from: o */
    public int mo9491o(int i) {
        return -1;
    }

    /* renamed from: r */
    public boolean mo9492r() {
        return mo9475l() == 0 || mo9477n() == 0 || mo9474k() == null || mo9473j() == null || mo9472i() == null;
    }

    /* renamed from: s */
    public void mo9493s(C2440b bVar) {
        this.f8566a = bVar;
    }
}
