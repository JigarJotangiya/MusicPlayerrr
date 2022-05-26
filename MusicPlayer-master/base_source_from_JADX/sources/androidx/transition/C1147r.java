package androidx.transition;

import android.view.ViewGroup;

/* renamed from: androidx.transition.r */
/* compiled from: Scene */
public class C1147r {

    /* renamed from: a */
    private ViewGroup f4723a;

    /* renamed from: b */
    private Runnable f4724b;

    /* renamed from: b */
    public static C1147r m6491b(ViewGroup viewGroup) {
        return (C1147r) viewGroup.getTag(C1143p.transition_current_scene);
    }

    /* renamed from: c */
    static void m6492c(ViewGroup viewGroup, C1147r rVar) {
        viewGroup.setTag(C1143p.transition_current_scene, rVar);
    }

    /* renamed from: a */
    public void mo6121a() {
        Runnable runnable;
        if (m6491b(this.f4723a) == this && (runnable = this.f4724b) != null) {
            runnable.run();
        }
    }
}
