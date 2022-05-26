package p159f.p166c.p224o.p225k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.imageview.ShapeableImageView;
import p082e.p157y.C4257a;
import p082e.p157y.C4258b;
import p159f.p166c.p224o.C4623e;
import p159f.p166c.p224o.C4624f;

/* renamed from: f.c.o.k.n */
/* compiled from: VideoLayoutItemVideoGridBinding */
public final class C4642n implements C4257a {

    /* renamed from: a */
    private final LinearLayout f13412a;

    /* renamed from: b */
    public final AppCompatCheckBox f13413b;

    /* renamed from: c */
    public final ShapeableImageView f13414c;

    /* renamed from: d */
    public final ShapeableImageView f13415d;

    /* renamed from: e */
    public final ShapeableImageView f13416e;

    /* renamed from: f */
    public final ProgressBar f13417f;

    /* renamed from: g */
    public final AppCompatTextView f13418g;

    /* renamed from: h */
    public final AppCompatTextView f13419h;

    /* renamed from: i */
    public final AppCompatTextView f13420i;

    private C4642n(LinearLayout linearLayout, AppCompatCheckBox appCompatCheckBox, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, ShapeableImageView shapeableImageView3, ProgressBar progressBar, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.f13412a = linearLayout;
        this.f13413b = appCompatCheckBox;
        this.f13414c = shapeableImageView;
        this.f13415d = shapeableImageView2;
        this.f13416e = shapeableImageView3;
        this.f13417f = progressBar;
        this.f13418g = appCompatTextView;
        this.f13419h = appCompatTextView2;
        this.f13420i = appCompatTextView3;
    }

    /* renamed from: b */
    public static C4642n m20134b(View view) {
        int i = C4623e.cb_select;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) C4258b.m18705a(view, i);
        if (appCompatCheckBox != null) {
            i = C4623e.iv_cover;
            ShapeableImageView shapeableImageView = (ShapeableImageView) C4258b.m18705a(view, i);
            if (shapeableImageView != null) {
                i = C4623e.iv_more;
                ShapeableImageView shapeableImageView2 = (ShapeableImageView) C4258b.m18705a(view, i);
                if (shapeableImageView2 != null) {
                    i = C4623e.iv_new;
                    ShapeableImageView shapeableImageView3 = (ShapeableImageView) C4258b.m18705a(view, i);
                    if (shapeableImageView3 != null) {
                        i = C4623e.pb_play;
                        ProgressBar progressBar = (ProgressBar) C4258b.m18705a(view, i);
                        if (progressBar != null) {
                            i = C4623e.tv_duration;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) C4258b.m18705a(view, i);
                            if (appCompatTextView != null) {
                                i = C4623e.tv_size;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C4258b.m18705a(view, i);
                                if (appCompatTextView2 != null) {
                                    i = C4623e.tv_title;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) C4258b.m18705a(view, i);
                                    if (appCompatTextView3 != null) {
                                        return new C4642n((LinearLayout) view, appCompatCheckBox, shapeableImageView, shapeableImageView2, shapeableImageView3, progressBar, appCompatTextView, appCompatTextView2, appCompatTextView3);
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
    public static C4642n m20135d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C4624f.video_layout_item_video_grid, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m20134b(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo7577a() {
        return this.f13412a;
    }
}
