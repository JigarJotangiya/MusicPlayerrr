package p159f.p166c.p224o.p225k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.coocent.videoplayer.weidget.view.AudioPlayBackItemView;
import p082e.p157y.C4257a;
import p082e.p157y.C4258b;
import p159f.p166c.p224o.C4623e;
import p159f.p166c.p224o.C4624f;

/* renamed from: f.c.o.k.a */
/* compiled from: VideoActivityContentBinding */
public final class C4629a implements C4257a {

    /* renamed from: a */
    private final CoordinatorLayout f13350a;

    /* renamed from: b */
    public final AudioPlayBackItemView f13351b;

    /* renamed from: c */
    public final FrameLayout f13352c;

    /* renamed from: d */
    public final FrameLayout f13353d;

    /* renamed from: e */
    public final SwipeRefreshLayout f13354e;

    /* renamed from: f */
    public final Toolbar f13355f;

    private C4629a(CoordinatorLayout coordinatorLayout, AudioPlayBackItemView audioPlayBackItemView, FrameLayout frameLayout, FrameLayout frameLayout2, SwipeRefreshLayout swipeRefreshLayout, LinearLayout linearLayout, Toolbar toolbar) {
        this.f13350a = coordinatorLayout;
        this.f13351b = audioPlayBackItemView;
        this.f13352c = frameLayout;
        this.f13353d = frameLayout2;
        this.f13354e = swipeRefreshLayout;
        this.f13355f = toolbar;
    }

    /* renamed from: b */
    public static C4629a m20083b(View view) {
        int i = C4623e.iv_audio_play;
        AudioPlayBackItemView audioPlayBackItemView = (AudioPlayBackItemView) C4258b.m18705a(view, i);
        if (audioPlayBackItemView != null) {
            i = C4623e.layout_ads;
            FrameLayout frameLayout = (FrameLayout) C4258b.m18705a(view, i);
            if (frameLayout != null) {
                i = C4623e.layout_container;
                FrameLayout frameLayout2 = (FrameLayout) C4258b.m18705a(view, i);
                if (frameLayout2 != null) {
                    i = C4623e.layout_refresh;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) C4258b.m18705a(view, i);
                    if (swipeRefreshLayout != null) {
                        i = C4623e.ll_container;
                        LinearLayout linearLayout = (LinearLayout) C4258b.m18705a(view, i);
                        if (linearLayout != null) {
                            i = C4623e.toolbar;
                            Toolbar toolbar = (Toolbar) C4258b.m18705a(view, i);
                            if (toolbar != null) {
                                return new C4629a((CoordinatorLayout) view, audioPlayBackItemView, frameLayout, frameLayout2, swipeRefreshLayout, linearLayout, toolbar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C4629a m20084d(LayoutInflater layoutInflater) {
        return m20085e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C4629a m20085e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C4624f.video_activity_content, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m20083b(inflate);
    }

    /* renamed from: c */
    public CoordinatorLayout mo7577a() {
        return this.f13350a;
    }
}
