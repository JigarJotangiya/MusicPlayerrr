package p159f.p166c.p224o.p225k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import p082e.p157y.C4257a;
import p082e.p157y.C4258b;
import p159f.p166c.p224o.C4623e;
import p159f.p166c.p224o.C4624f;

/* renamed from: f.c.o.k.c */
/* compiled from: VideoFragmentVideoBinding */
public final class C4631c implements C4257a {

    /* renamed from: a */
    private final FrameLayout f13362a;

    /* renamed from: b */
    public final FrameLayout f13363b;

    /* renamed from: c */
    public final C4634f f13364c;

    /* renamed from: d */
    public final C4639k f13365d;

    /* renamed from: e */
    public final RecyclerView f13366e;

    private C4631c(FrameLayout frameLayout, FrameLayout frameLayout2, C4634f fVar, C4639k kVar, RecyclerView recyclerView) {
        this.f13362a = frameLayout;
        this.f13363b = frameLayout2;
        this.f13364c = fVar;
        this.f13365d = kVar;
        this.f13366e = recyclerView;
    }

    /* renamed from: b */
    public static C4631c m20092b(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = C4623e.layout_permission;
        View a = C4258b.m18705a(view, i);
        if (a != null) {
            C4634f b = C4634f.m20104b(a);
            i = C4623e.layout_video_empty;
            View a2 = C4258b.m18705a(view, i);
            if (a2 != null) {
                C4639k b2 = C4639k.m20123b(a2);
                i = C4623e.rv_video;
                RecyclerView recyclerView = (RecyclerView) C4258b.m18705a(view, i);
                if (recyclerView != null) {
                    return new C4631c(frameLayout, frameLayout, b, b2, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C4631c m20093d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C4624f.video_fragment_video, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m20092b(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo7577a() {
        return this.f13362a;
    }
}
