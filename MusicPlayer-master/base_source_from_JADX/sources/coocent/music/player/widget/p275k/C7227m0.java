package coocent.music.player.widget.p275k;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import coocent.music.player.base.BaseApplication;
import coocent.musiclibrary.music.p281b.C7323b;
import coocent.musiclibrary.music.view.LyricSetView;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: coocent.music.player.widget.k.m0 */
/* compiled from: LyricTextSetPopup */
public class C7227m0 extends C7217j0 implements LyricSetView.C7410b {

    /* renamed from: k */
    private View f31922k;

    /* renamed from: l */
    private LyricSetView f31923l;

    /* renamed from: m */
    private final int f31924m;

    /* renamed from: n */
    private final int f31925n;

    public C7227m0(Activity activity, int i, int i2, C7323b bVar) {
        super(activity);
        this.f31924m = i;
        this.f31925n = i2;
        m40989m(activity);
        m40992p();
        m40990n(bVar);
    }

    /* renamed from: m */
    private void m40989m(Context context) {
        View inflate = View.inflate(context, R.layout.lyric_set, (ViewGroup) null);
        this.f31922k = inflate;
        this.f31923l = (LyricSetView) inflate.findViewById(R.id.lyricSetView);
        m40991o();
    }

    /* renamed from: n */
    private void m40990n(C7323b bVar) {
        this.f31923l.setLyricSetCallBack(bVar);
        this.f31923l.setCancelListener(this);
    }

    /* renamed from: o */
    private void m40991o() {
        setWidth(C8345u.m46331l());
        setWindowLayoutMode(-1, -2);
        setContentView(this.f31922k);
        setFocusable(true);
        setOutsideTouchable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setAnimationStyle(R.style.nowplaylist);
    }

    /* renamed from: p */
    private void m40992p() {
        this.f31923l.setTextSize(this.f31924m);
        this.f31923l.setTextColor(this.f31925n);
    }

    public void cancel() {
        dismiss();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo27742i() {
        super.mo27742i();
    }

    /* renamed from: k */
    public void mo27743k(View view) {
        super.mo27743k(view);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (BaseApplication.f31159w && BaseApplication.f31158v) {
            setSoftInputMode(48);
        }
        showAtLocation(view, 83, 0, -iArr[1]);
        setOnDismissListener(this.f31891j);
    }

    /* renamed from: l */
    public ImageView mo27775l() {
        LyricSetView lyricSetView = this.f31923l;
        if (lyricSetView != null) {
            return lyricSetView.getLyricBgView();
        }
        return null;
    }
}
