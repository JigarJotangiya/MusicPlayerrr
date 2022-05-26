package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.impl.C1285j;
import java.util.Collections;
import java.util.List;

@SuppressLint({"AddedAbstractMethod"})
/* renamed from: androidx.work.v */
/* compiled from: WorkManager */
public abstract class C1422v {
    protected C1422v() {
    }

    /* renamed from: d */
    public static C1422v m7482d(Context context) {
        return C1285j.m7100k(context);
    }

    /* renamed from: e */
    public static void m7483e(Context context, C1228b bVar) {
        C1285j.m7098e(context, bVar);
    }

    /* renamed from: a */
    public abstract C1410o mo6602a(String str);

    /* renamed from: b */
    public final C1410o mo6830b(C1423w wVar) {
        return mo6603c(Collections.singletonList(wVar));
    }

    /* renamed from: c */
    public abstract C1410o mo6603c(List<? extends C1423w> list);
}
