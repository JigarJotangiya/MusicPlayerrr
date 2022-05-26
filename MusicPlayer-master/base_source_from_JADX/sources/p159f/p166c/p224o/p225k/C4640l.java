package p159f.p166c.p224o.p225k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.imageview.ShapeableImageView;
import p082e.p157y.C4257a;
import p082e.p157y.C4258b;
import p159f.p166c.p224o.C4623e;
import p159f.p166c.p224o.C4624f;

/* renamed from: f.c.o.k.l */
/* compiled from: VideoLayoutItemFolderGridBinding */
public final class C4640l implements C4257a {

    /* renamed from: a */
    private final LinearLayout f13397a;

    /* renamed from: b */
    public final AppCompatCheckBox f13398b;

    /* renamed from: c */
    public final ShapeableImageView f13399c;

    /* renamed from: d */
    public final AppCompatImageView f13400d;

    /* renamed from: e */
    public final ShapeableImageView f13401e;

    /* renamed from: f */
    public final AppCompatTextView f13402f;

    /* renamed from: g */
    public final AppCompatTextView f13403g;

    private C4640l(LinearLayout linearLayout, AppCompatCheckBox appCompatCheckBox, ShapeableImageView shapeableImageView, AppCompatImageView appCompatImageView, ShapeableImageView shapeableImageView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f13397a = linearLayout;
        this.f13398b = appCompatCheckBox;
        this.f13399c = shapeableImageView;
        this.f13400d = appCompatImageView;
        this.f13401e = shapeableImageView2;
        this.f13402f = appCompatTextView;
        this.f13403g = appCompatTextView2;
    }

    /* renamed from: b */
    public static C4640l m20126b(View view) {
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
                        i = C4623e.tv_num;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) C4258b.m18705a(view, i);
                        if (appCompatTextView != null) {
                            i = C4623e.tv_title;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C4258b.m18705a(view, i);
                            if (appCompatTextView2 != null) {
                                return new C4640l((LinearLayout) view, appCompatCheckBox, shapeableImageView, appCompatImageView, shapeableImageView2, appCompatTextView, appCompatTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C4640l m20127d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C4624f.video_layout_item_folder_grid, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m20126b(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo7577a() {
        return this.f13397a;
    }
}
