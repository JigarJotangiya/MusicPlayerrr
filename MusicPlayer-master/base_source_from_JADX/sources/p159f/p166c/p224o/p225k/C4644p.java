package p159f.p166c.p224o.p225k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p082e.p157y.C4257a;
import p082e.p157y.C4258b;
import p159f.p166c.p224o.C4623e;
import p159f.p166c.p224o.C4624f;

/* renamed from: f.c.o.k.p */
/* compiled from: VideoPlayerActivitySearchBinding */
public final class C4644p implements C4257a {

    /* renamed from: a */
    private final LinearLayout f13431a;

    /* renamed from: b */
    public final C4645q f13432b;

    private C4644p(LinearLayout linearLayout, C4645q qVar) {
        this.f13431a = linearLayout;
        this.f13432b = qVar;
    }

    /* renamed from: b */
    public static C4644p m20142b(View view) {
        int i = C4623e.app_bar;
        View a = C4258b.m18705a(view, i);
        if (a != null) {
            return new C4644p((LinearLayout) view, C4645q.m20147b(a));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C4644p m20143d(LayoutInflater layoutInflater) {
        return m20144e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C4644p m20144e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C4624f.video_player_activity_search, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m20142b(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo7577a() {
        return this.f13431a;
    }
}
