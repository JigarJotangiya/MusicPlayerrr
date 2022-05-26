package p159f.p166c.p224o.p225k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p082e.p157y.C4257a;
import p082e.p157y.C4258b;
import p159f.p166c.p224o.C4623e;
import p159f.p166c.p224o.C4624f;

/* renamed from: f.c.o.k.o */
/* compiled from: VideoLayoutItemVideoListBinding */
public final class C4643o implements C4257a {

    /* renamed from: a */
    private final LinearLayout f13421a;

    /* renamed from: b */
    public final AppCompatCheckBox f13422b;

    /* renamed from: c */
    public final ShapeableImageView f13423c;

    /* renamed from: d */
    public final AppCompatImageView f13424d;

    /* renamed from: e */
    public final ShapeableImageView f13425e;

    /* renamed from: f */
    public final ProgressBar f13426f;

    /* renamed from: g */
    public final AppCompatTextView f13427g;

    /* renamed from: h */
    public final MaterialTextView f13428h;

    /* renamed from: i */
    public final AppCompatTextView f13429i;

    /* renamed from: j */
    public final AppCompatTextView f13430j;

    private C4643o(LinearLayout linearLayout, AppCompatCheckBox appCompatCheckBox, ShapeableImageView shapeableImageView, AppCompatImageView appCompatImageView, ShapeableImageView shapeableImageView2, ProgressBar progressBar, AppCompatTextView appCompatTextView, MaterialTextView materialTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.f13421a = linearLayout;
        this.f13422b = appCompatCheckBox;
        this.f13423c = shapeableImageView;
        this.f13424d = appCompatImageView;
        this.f13425e = shapeableImageView2;
        this.f13426f = progressBar;
        this.f13427g = appCompatTextView;
        this.f13428h = materialTextView;
        this.f13429i = appCompatTextView2;
        this.f13430j = appCompatTextView3;
    }

    /* renamed from: b */
    public static C4643o m20138b(View view) {
        int i = C4623e.cb_select;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) C4258b.m18705a(view, i);
        if (appCompatCheckBox != null) {
            i = C4623e.iv_cover;
            ShapeableImageView shapeableImageView = (ShapeableImageView) C4258b.m18705a(view, i);
            if (shapeableImageView != null) {
                i = C4623e.iv_more;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C4258b.m18705a(view, i);
                if (appCompatImageView != null) {
                    i = C4623e.iv_new;
                    ShapeableImageView shapeableImageView2 = (ShapeableImageView) C4258b.m18705a(view, i);
                    if (shapeableImageView2 != null) {
                        i = C4623e.pb_play;
                        ProgressBar progressBar = (ProgressBar) C4258b.m18705a(view, i);
                        if (progressBar != null) {
                            i = C4623e.tv_duration;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) C4258b.m18705a(view, i);
                            if (appCompatTextView != null) {
                                i = C4623e.tv_play_progress;
                                MaterialTextView materialTextView = (MaterialTextView) C4258b.m18705a(view, i);
                                if (materialTextView != null) {
                                    i = C4623e.tv_size;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C4258b.m18705a(view, i);
                                    if (appCompatTextView2 != null) {
                                        i = C4623e.tv_title;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) C4258b.m18705a(view, i);
                                        if (appCompatTextView3 != null) {
                                            return new C4643o((LinearLayout) view, appCompatCheckBox, shapeableImageView, appCompatImageView, shapeableImageView2, progressBar, appCompatTextView, materialTextView, appCompatTextView2, appCompatTextView3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C4643o m20139d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C4624f.video_layout_item_video_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m20138b(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo7577a() {
        return this.f13421a;
    }
}
