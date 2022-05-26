package coocent.musiclibrary.music.p292j;

import android.os.CountDownTimer;
import java.util.ArrayList;
import java.util.List;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: coocent.musiclibrary.music.j.k */
/* compiled from: TimerSleepHelper.kt */
public final class C7398k {

    /* renamed from: a */
    public static final C7398k f32508a = new C7398k();

    /* renamed from: b */
    private static C7399a f32509b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static List<C7401l> f32510c = new ArrayList();

    /* renamed from: coocent.musiclibrary.music.j.k$a */
    /* compiled from: TimerSleepHelper.kt */
    public static final class C7399a extends CountDownTimer {

        /* renamed from: a */
        public static final C7400a f32511a = new C7400a((C8589g) null);

        /* renamed from: coocent.musiclibrary.music.j.k$a$a */
        /* compiled from: TimerSleepHelper.kt */
        public static final class C7400a {
            private C7400a() {
            }

            public /* synthetic */ C7400a(C8589g gVar) {
                this();
            }

            /* renamed from: a */
            public final C7399a mo28209a(long j) {
                return new C7399a(j);
            }
        }

        public C7399a(long j) {
            super(j, 1000);
        }

        public void onFinish() {
            for (C7401l f : C7398k.f32510c) {
                f.mo26664f();
            }
            C7398k kVar = C7398k.f32508a;
            C7398k.m41738c();
        }

        public void onTick(long j) {
            for (C7401l k1 : C7398k.f32510c) {
                k1.mo26670k1(j);
            }
        }
    }

    static {
        C8594l.m46770d(C7398k.class.getSimpleName(), "TimerSleepHelper::class.java.simpleName");
    }

    private C7398k() {
    }

    /* renamed from: c */
    public static final void m41738c() {
        f32510c.clear();
    }

    /* renamed from: d */
    public static final void m41739d(long j, C7401l lVar) {
        C8594l.m46771e(lVar, "timerSleepListener");
        f32510c.add(lVar);
        C7399a aVar = f32509b;
        if (aVar != null) {
            aVar.cancel();
        }
        C7399a a = C7399a.f32511a.mo28209a(j);
        f32509b = a;
        if (a != null) {
            a.start();
        }
    }

    /* renamed from: e */
    public static final void m41740e() {
        C7399a aVar = f32509b;
        if (aVar != null) {
            aVar.cancel();
        }
        f32509b = null;
    }

    /* renamed from: b */
    public final String mo28206b(long j) {
        if (j < 0) {
            return "00:00";
        }
        StringBuilder sb = new StringBuilder();
        long j2 = (long) 60;
        long j3 = (j / j2) / j2;
        String str = "0";
        if (j3 > 0) {
            sb.append(j3 < 10 ? str : BuildConfig.FLAVOR);
            sb.append(j3);
            sb.append(":");
            j -= (j3 * j2) * j2;
        }
        long j4 = j / j2;
        sb.append(j4 < 10 ? str : BuildConfig.FLAVOR);
        sb.append(j4);
        sb.append(":");
        long j5 = j % j2;
        if (j5 >= 10) {
            str = BuildConfig.FLAVOR;
        }
        sb.append(str);
        sb.append(j5);
        String sb2 = sb.toString();
        C8594l.m46770d(sb2, "{\n            val sb = java.lang.StringBuilder()\n            val hour = second / 60 / 60\n            if (hour > 0) {\n                sb.append(if (hour < 10) \"0\" else \"\").append(hour).append(\":\")\n                second -= hour * 60 * 60\n            }\n            val min = second / 60\n            sb.append(if (min < 10) \"0\" else \"\").append(min).append(\":\")\n            val sec = second % 60\n            sb.append(if (sec < 10) \"0\" else \"\").append(sec)\n            sb.toString()\n        }");
        return sb2;
    }
}
