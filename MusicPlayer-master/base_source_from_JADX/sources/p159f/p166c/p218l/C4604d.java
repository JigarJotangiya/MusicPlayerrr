package p159f.p166c.p218l;

import android.content.Context;
import androidx.core.content.C0506a;
import p159f.p166c.p218l.p219e.C4605a;
import p159f.p166c.p218l.p220f.C4611a;

/* renamed from: f.c.l.d */
/* compiled from: SleepApi */
public class C4604d {
    /* renamed from: a */
    public static void m20042a(Context context, int i, int i2, int i3, int i4, C4611a aVar) {
        C4605a aVar2 = new C4605a(context, C0506a.m3150b(context, i), C0506a.m3150b(context, i2), C0506a.m3150b(context, i3), C0506a.m3150b(context, i4));
        aVar2.mo15349k(aVar);
        aVar2.show();
    }

    /* renamed from: b */
    public static void m20043b(Context context, C4611a aVar) {
        m20044c(context, true, aVar);
    }

    /* renamed from: c */
    public static void m20044c(Context context, boolean z, C4611a aVar) {
        if (z) {
            m20042a(context, C4601a.lightBg, C4601a.black, C4601a.transBlack, C4601a.colorAccent, aVar);
            return;
        }
        m20042a(context, C4601a.darkBg, C4601a.white, C4601a.transWhite, C4601a.colorAccent, aVar);
    }
}
