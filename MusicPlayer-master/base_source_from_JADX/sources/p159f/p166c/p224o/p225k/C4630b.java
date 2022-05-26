package p159f.p166c.p224o.p225k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import p082e.p157y.C4257a;
import p082e.p157y.C4258b;
import p159f.p166c.p224o.C4623e;
import p159f.p166c.p224o.C4624f;

/* renamed from: f.c.o.k.b */
/* compiled from: VideoFragmentFolderBinding */
public final class C4630b implements C4257a {

    /* renamed from: a */
    private final FrameLayout f13356a;

    /* renamed from: b */
    public final AppCompatButton f13357b;

    /* renamed from: c */
    public final FrameLayout f13358c;

    /* renamed from: d */
    public final LinearLayout f13359d;

    /* renamed from: e */
    public final LinearLayout f13360e;

    /* renamed from: f */
    public final RecyclerView f13361f;

    private C4630b(FrameLayout frameLayout, AppCompatButton appCompatButton, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, FrameLayout frameLayout2, LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, AppCompatTextView appCompatTextView) {
        this.f13356a = frameLayout;
        this.f13357b = appCompatButton;
        this.f13358c = frameLayout2;
        this.f13359d = linearLayout;
        this.f13360e = linearLayout2;
        this.f13361f = recyclerView;
    }

    /* renamed from: b */
    public static C4630b m20088b(View view) {
        int i = C4623e.btn_permission;
        AppCompatButton appCompatButton = (AppCompatButton) C4258b.m18705a(view, i);
        if (appCompatButton != null) {
            i = C4623e.iv_empty;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C4258b.m18705a(view, i);
            if (appCompatImageView != null) {
                i = C4623e.iv_photo;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) C4258b.m18705a(view, i);
                if (appCompatImageView2 != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    i = C4623e.layout_folder_empty;
                    LinearLayout linearLayout = (LinearLayout) C4258b.m18705a(view, i);
                    if (linearLayout != null) {
                        i = C4623e.layout_permission;
                        LinearLayout linearLayout2 = (LinearLayout) C4258b.m18705a(view, i);
                        if (linearLayout2 != null) {
                            i = C4623e.rv_folder;
                            RecyclerView recyclerView = (RecyclerView) C4258b.m18705a(view, i);
                            if (recyclerView != null) {
                                i = C4623e.tv_tips_permission;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) C4258b.m18705a(view, i);
                                if (appCompatTextView != null) {
                                    return new C4630b(frameLayout, appCompatButton, appCompatImageView, appCompatImageView2, frameLayout, linearLayout, linearLayout2, recyclerView, appCompatTextView);
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
    public static C4630b m20089d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C4624f.video_fragment_folder, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m20088b(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo7577a() {
        return this.f13356a;
    }
}
