package coocent.music.player.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.C1184a;
import p342g.p343a.p344a.p358i.C8321j;

/* renamed from: coocent.music.player.adapter.k */
/* compiled from: SplashSkinAdapter */
public class C7031k extends C1184a {

    /* renamed from: c */
    private final Context f31134c;

    /* renamed from: d */
    private int[] f31135d;

    public C7031k(Context context, int[] iArr) {
        this.f31135d = iArr;
        this.f31134c = context;
    }

    /* renamed from: b */
    public void mo4039b(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* renamed from: e */
    public int mo6295e() {
        return Integer.MAX_VALUE;
    }

    /* renamed from: k */
    public boolean mo4042k(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: v */
    public View mo4041j(ViewGroup viewGroup, int i) {
        int length = i % this.f31135d.length;
        ImageView imageView = new ImageView(this.f31134c);
        C8321j.m46001g(this.f31135d[length], imageView);
        viewGroup.addView(imageView);
        return imageView;
    }
}
