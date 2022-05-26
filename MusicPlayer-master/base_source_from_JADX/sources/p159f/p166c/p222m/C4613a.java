package p159f.p166c.p222m;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import java.util.List;
import p369i.C8457t;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.m.a */
/* compiled from: IVideoConfig.kt */
public interface C4613a {

    /* renamed from: f.c.m.a$a */
    /* compiled from: IVideoConfig.kt */
    public static final class C4614a {
        /* renamed from: a */
        public static void m20077a(C4613a aVar, Activity activity, List<? extends Parcelable> list, C8570l<? super List<? extends Parcelable>, C8457t> lVar) {
            C8594l.m46771e(aVar, "this");
            C8594l.m46771e(activity, "activity");
            C8594l.m46771e(list, "list");
            C8594l.m46771e(lVar, "deleteFunc");
            lVar.invoke(list);
        }

        /* renamed from: b */
        public static void m20078b(C4613a aVar, Context context, Parcelable parcelable) {
            C8594l.m46771e(aVar, "this");
            C8594l.m46771e(context, "context");
            C8594l.m46771e(parcelable, "video");
        }

        /* renamed from: c */
        public static void m20079c(C4613a aVar, Context context, int i, List<Parcelable> list, List<Parcelable> list2) {
            C8594l.m46771e(aVar, "this");
            C8594l.m46771e(context, "context");
            C8594l.m46771e(list, "operateList");
            C8594l.m46771e(list2, "videoList");
        }
    }

    /* renamed from: a */
    void mo15355a(Application application);

    /* renamed from: b */
    void mo15356b(Context context, String str);

    /* renamed from: c */
    int mo15357c();

    /* renamed from: d */
    void mo15358d(Context context, Parcelable parcelable);

    /* renamed from: e */
    void mo15359e(ViewGroup viewGroup);

    /* renamed from: f */
    void mo15360f(Context context, Parcelable parcelable);

    /* renamed from: g */
    void mo15361g(ViewGroup viewGroup);

    /* renamed from: h */
    boolean mo15362h();

    /* renamed from: i */
    void mo15363i(Context context, int i, List<Parcelable> list, List<Parcelable> list2);

    /* renamed from: j */
    boolean mo15364j(Application application, boolean z);

    /* renamed from: k */
    void mo15365k(ViewGroup viewGroup);

    /* renamed from: l */
    boolean mo15366l();

    /* renamed from: m */
    void mo15367m(Activity activity, List<? extends Parcelable> list, C8570l<? super List<? extends Parcelable>, C8457t> lVar);

    /* renamed from: n */
    void mo15368n(Activity activity);

    /* renamed from: o */
    void mo15369o(Context context, Parcelable parcelable);
}
