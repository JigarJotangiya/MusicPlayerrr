package coocent.music.player.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.C1184a;
import com.bumptech.glide.C1719b;
import coocent.music.player.widget.ZoomImageView;

/* renamed from: coocent.music.player.adapter.l */
/* compiled from: WidgetDialogShowAdapter */
public class C7032l extends C1184a {

    /* renamed from: c */
    private int[] f31136c;

    /* renamed from: d */
    private Context f31137d;

    public C7032l(Context context, int[] iArr) {
        this.f31137d = context;
        this.f31136c = iArr;
    }

    /* renamed from: b */
    public void mo4039b(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* renamed from: e */
    public int mo6295e() {
        int[] iArr = this.f31136c;
        if (iArr != null) {
            return iArr.length;
        }
        return 0;
    }

    /* renamed from: f */
    public int mo6296f(Object obj) {
        return super.mo6296f(obj);
    }

    /* renamed from: j */
    public Object mo4041j(ViewGroup viewGroup, int i) {
        ZoomImageView zoomImageView = new ZoomImageView(this.f31137d);
        if (this.f31136c != null) {
            C1719b.m8597t(this.f31137d).mo7662s(Integer.valueOf(this.f31136c[i])).mo7645z0(zoomImageView);
        }
        viewGroup.addView(zoomImageView);
        return zoomImageView;
    }

    /* renamed from: k */
    public boolean mo4042k(View view, Object obj) {
        return view == obj;
    }
}
