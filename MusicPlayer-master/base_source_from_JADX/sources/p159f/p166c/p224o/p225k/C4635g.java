package p159f.p166c.p224o.p225k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import p082e.p157y.C4257a;
import p082e.p157y.C4258b;
import p159f.p166c.p224o.C4623e;
import p159f.p166c.p224o.C4624f;

/* renamed from: f.c.o.k.g */
/* compiled from: VideoLayoutDialogProgressBinding */
public final class C4635g implements C4257a {

    /* renamed from: a */
    private final LinearLayout f13381a;

    /* renamed from: b */
    public final ProgressBar f13382b;

    /* renamed from: c */
    public final TextView f13383c;

    private C4635g(LinearLayout linearLayout, LinearLayout linearLayout2, ProgressBar progressBar, TextView textView) {
        this.f13381a = linearLayout;
        this.f13382b = progressBar;
        this.f13383c = textView;
    }

    /* renamed from: b */
    public static C4635g m20107b(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = C4623e.progress_bar_loading;
        ProgressBar progressBar = (ProgressBar) C4258b.m18705a(view, i);
        if (progressBar != null) {
            i = C4623e.tv_loading;
            TextView textView = (TextView) C4258b.m18705a(view, i);
            if (textView != null) {
                return new C4635g(linearLayout, linearLayout, progressBar, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C4635g m20108d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C4624f.video_layout_dialog_progress, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m20107b(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo7577a() {
        return this.f13381a;
    }
}
