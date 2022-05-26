package p159f.p166c.p224o.p225k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatEditText;
import p082e.p157y.C4257a;
import p082e.p157y.C4258b;
import p159f.p166c.p224o.C4623e;
import p159f.p166c.p224o.C4624f;

/* renamed from: f.c.o.k.h */
/* compiled from: VideoLayoutDialogRenameBinding */
public final class C4636h implements C4257a {

    /* renamed from: a */
    private final RelativeLayout f13384a;

    /* renamed from: b */
    public final AppCompatEditText f13385b;

    private C4636h(RelativeLayout relativeLayout, AppCompatEditText appCompatEditText) {
        this.f13384a = relativeLayout;
        this.f13385b = appCompatEditText;
    }

    /* renamed from: b */
    public static C4636h m20111b(View view) {
        int i = C4623e.et_rename;
        AppCompatEditText appCompatEditText = (AppCompatEditText) C4258b.m18705a(view, i);
        if (appCompatEditText != null) {
            return new C4636h((RelativeLayout) view, appCompatEditText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C4636h m20112d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C4624f.video_layout_dialog_rename, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m20111b(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo7577a() {
        return this.f13384a;
    }
}
