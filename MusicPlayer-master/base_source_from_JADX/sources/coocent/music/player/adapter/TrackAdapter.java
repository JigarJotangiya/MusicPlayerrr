package coocent.music.player.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.C0549e;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.coocent.music.base.data.entity.Music;
import com.coocent.music.base.p056ui.view.SignKeyWordTextView;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.widget.EqualizerView;
import java.util.ArrayList;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p346c.C7949b;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8343s;
import p443m.p444a.p447e.p448a.C9332d;

public class TrackAdapter extends MultiItemAdapter<Music, BaseViewHolder> {

    /* renamed from: b */
    private final int f31104b;

    /* renamed from: c */
    private int f31105c = -1;

    /* renamed from: d */
    private long f31106d = 0;

    /* renamed from: e */
    private final List<Music> f31107e;

    /* renamed from: f */
    private boolean f31108f = false;

    /* renamed from: g */
    private C7949b f31109g;

    /* renamed from: h */
    public List<Music> f31110h;

    public TrackAdapter(int i, List<Music> list, int i2, long j, int i3, boolean z, int i4) {
        super(list);
        this.f31107e = list;
        m39984x(z);
        this.f31105c = i2;
        this.f31106d = j;
        this.f31104b = i4;
        addItemType(0, i);
        addItemType(6, R.layout.item_native_ads_list);
    }

    /* renamed from: i */
    private void m39978i(boolean z, boolean z2, long j) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("disPlaySelectTitle", z);
        bundle.putBoolean("isPlaylistDetail", z2);
        bundle.putLong("currentPlaylistId", j);
        Intent intent = new Intent("media.musicplayer.audioplayer.videoplayer.select_track_to_updata_ui");
        intent.putExtras(bundle);
        Context context = this.mContext;
        if (context != null) {
            context.sendBroadcast(new Intent(intent));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ boolean mo26914m(Music music, View view, MotionEvent motionEvent) {
        return this.f31110h.contains(music);
    }

    /* renamed from: n */
    static /* synthetic */ boolean m39980n(View view, MotionEvent motionEvent) {
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ boolean mo26915p(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        mo26916q(i);
        List<Music> list = this.f31107e;
        boolean z = false;
        mo26907A(false, list == null ? 0 : list.size());
        if (this.f31105c == 6) {
            z = true;
        }
        if (mo26909f(z, this.f31106d)) {
        }
        return true;
    }

    /* renamed from: u */
    private void m39982u(BaseViewHolder baseViewHolder, Music music, TextView textView, EqualizerView equalizerView, ImageView imageView) {
        if (C8287e.m45800P() && C8287e.m45796N() == this.f31105c) {
            imageView.setVisibility(8);
            equalizerView.setVisibility(8);
        } else if (C8287e.m45873v() == null || C8287e.m45873v().mo9215k() != music.mo9215k()) {
            equalizerView.setVisibility(8);
            baseViewHolder.setTextColor(R.id.song_title, C8343s.m46295c(R.color.default_text_color));
            baseViewHolder.setTextColor(R.id.song_artist, C8343s.m46295c(R.color.app_sub_title_color));
            textView.setVisibility(0);
            imageView.setVisibility(0);
        } else {
            equalizerView.setVisibility(0);
            baseViewHolder.setTextColor(R.id.song_title, C8343s.m46300h());
            baseViewHolder.setTextColor(R.id.song_artist, C8343s.m46300h());
            textView.setVisibility(4);
            imageView.setVisibility(4);
            try {
                if (C8287e.m45812V()) {
                    equalizerView.mo27498a();
                } else {
                    equalizerView.mo27499d();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: w */
    private void m39983w(boolean z) {
        C7949b bVar = this.f31109g;
        if (bVar != null) {
            bVar.mo29479B(!z);
        }
    }

    /* renamed from: x */
    private void m39984x(boolean z) {
        if (z) {
            setOnItemLongClickListener(new C7019b(this));
        }
    }

    /* renamed from: A */
    public void mo26907A(boolean z, int i) {
        Intent intent = new Intent("media.musicplayer.audioplayer.videoplayer.select_track_to_updata_num");
        intent.putExtra("isClickTitleToSelectAll", z);
        intent.putExtra("listSize", i);
        Context context = this.mContext;
        if (context != null) {
            context.sendBroadcast(new Intent(intent));
        }
    }

    /* renamed from: e */
    public boolean mo26908e() {
        boolean P = C8287e.m45800P();
        if (P) {
            mo26922z(false, this.f31106d);
            mo26918s(false, false);
            List<Music> list = this.f31107e;
            mo26907A(false, list == null ? 0 : list.size());
            mo26910g();
        }
        return P;
    }

    /* renamed from: f */
    public boolean mo26909f(boolean z, long j) {
        if (C8287e.m45800P()) {
            mo26908e();
            m39983w(true);
            return true;
        }
        m39983w(false);
        mo26922z(z, j);
        return false;
    }

    /* renamed from: g */
    public void mo26910g() {
        C8287e.m45849j();
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: h */
    public void convert(BaseViewHolder baseViewHolder, Music music) {
        int itemViewType = baseViewHolder.getItemViewType();
        int i = 0;
        if (itemViewType == 0) {
            SignKeyWordTextView signKeyWordTextView = (SignKeyWordTextView) baseViewHolder.getView(R.id.song_title);
            SignKeyWordTextView signKeyWordTextView2 = (SignKeyWordTextView) baseViewHolder.getView(R.id.song_artist);
            int i2 = this.f31104b;
            if (i2 == 2 || i2 == 4) {
                signKeyWordTextView.setSignText(BaseApplication.f31146j);
                signKeyWordTextView2.setSignText(BaseApplication.f31146j);
                signKeyWordTextView.setSignTextColor(C8343s.m46300h());
                signKeyWordTextView2.setSignTextColor(C8343s.m46300h());
            }
            baseViewHolder.setText((int) R.id.song_title, (CharSequence) music.mo9218n());
            baseViewHolder.setTextColor(R.id.song_title, C9332d.m49405b(this.mContext, R.color.default_text_color));
            baseViewHolder.setText((int) R.id.song_artist, (CharSequence) music.mo9210g());
            baseViewHolder.setTextColor(R.id.song_artist, C8343s.m46295c(R.color.app_sub_title_color));
            baseViewHolder.setTextColor(R.id.song_time, C8343s.m46295c(R.color.app_sub_title_color));
            ImageView imageView = (ImageView) baseViewHolder.getView(R.id.iv_add_to_playlist);
            imageView.setImageDrawable(C8343s.m46304l(R.drawable.ic_home10_add_to_playlist, R.color.menu_tint_color));
            baseViewHolder.setImageDrawable(R.id.popup_menu, C8343s.m46304l(R.drawable.ic_home04_more, R.color.menu_tint_color));
            m39982u(baseViewHolder, music, (TextView) baseViewHolder.getView(R.id.song_time), (EqualizerView) baseViewHolder.getView(R.id.song_equalizerView), imageView);
            baseViewHolder.setGone(R.id.albumArt, false);
            baseViewHolder.setVisible(R.id.popup_menu, !C8287e.m45800P() || C8287e.m45796N() != this.f31105c);
            CheckBox checkBox = (CheckBox) baseViewHolder.getView(R.id.cb_select);
            if (!C8287e.m45800P() || C8287e.m45796N() != this.f31105c) {
                i = 8;
            }
            checkBox.setVisibility(i);
            mo26919t(checkBox);
            View view = baseViewHolder.getView(R.id.item_root);
            List<Music> list = this.f31110h;
            if (list != null) {
                if (list.contains(music)) {
                    checkBox.setChecked(true);
                } else {
                    checkBox.setChecked(music.mo9221q());
                }
                if (this.f31110h.contains(music)) {
                    C0549e.m3395c(checkBox, (ColorStateList) null);
                    checkBox.setButtonDrawable(C8343s.m46298f(R.drawable.ic_toolbar_08_2));
                } else {
                    mo26919t(checkBox);
                    checkBox.setButtonDrawable(C8343s.m46298f(R.drawable.check_button_custom));
                }
                view.setOnTouchListener(new C7018a(this, music));
            } else {
                checkBox.setChecked(music.mo9221q());
                checkBox.setEnabled(true);
                view.setOnTouchListener(C7020c.f31116g);
            }
            baseViewHolder.addOnClickListener(R.id.popup_menu);
            baseViewHolder.addOnClickListener(R.id.iv_add_to_playlist);
        } else if (itemViewType == 6) {
            mo26891d(baseViewHolder, false);
        }
    }

    /* renamed from: j */
    public long mo26912j() {
        return this.f31106d;
    }

    /* renamed from: k */
    public void mo26913k() {
        boolean z = this.f31108f;
        if (z) {
            try {
                List<Music> O = C8287e.m45798O();
                ArrayList arrayList = new ArrayList(this.f31107e);
                boolean z2 = false;
                for (int i = 0; i < this.f31107e.size(); i++) {
                    if (this.f31107e.get(i).mo9215k() == 0) {
                        arrayList.remove(i);
                    }
                }
                if (O.size() == arrayList.size()) {
                    z2 = true;
                }
                this.f31108f = z2;
                z = z2;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        mo26918s(!z, true);
    }

    /* renamed from: q */
    public void mo26916q(int i) {
        List<Music> list = this.f31107e;
        if (list != null && list.size() > 0) {
            if (!this.f31107e.get(i).mo9221q()) {
                C8287e.m45825b(this.f31107e.get(i));
            } else {
                List<Music> O = C8287e.m45798O();
                if (O != null) {
                    ArrayList arrayList = new ArrayList(O);
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (((Music) arrayList.get(i2)).mo9215k() == this.f31107e.get(i).mo9215k()) {
                            O.remove((Music) arrayList.get(i2));
                        }
                    }
                }
            }
            this.f31107e.get(i).mo9232z(!this.f31107e.get(i).mo9221q());
            notifyItemChanged(i + getHeaderLayoutCount());
        }
    }

    /* renamed from: r */
    public void mo26917r(boolean z) {
        if (C8287e.m45800P() != z) {
            C8287e.m45793L0(z);
            C8287e.m45791K0(z ? this.f31105c : -1);
            notifyDataSetChanged();
        }
    }

    /* renamed from: s */
    public void mo26918s(boolean z, boolean z2) {
        List<Music> list = this.f31107e;
        if (list != null && list.size() > 0) {
            int i = 0;
            if (C8287e.m45798O() != null) {
                if (z && C8287e.m45798O() != null && C8287e.m45798O().size() > 0) {
                    C8287e.m45849j();
                }
                for (int i2 = 0; i2 < this.f31107e.size(); i2++) {
                    if (this.f31107e.get(i2).mo9261a() == 0) {
                        this.f31107e.get(i2).mo9232z(z);
                        if (z) {
                            C8287e.m45825b(this.f31107e.get(i2));
                        } else if (C8287e.m45798O() != null && C8287e.m45798O().size() > 0) {
                            C8287e.m45849j();
                        }
                    }
                }
            }
            this.f31108f = z;
            List<Music> list2 = this.f31107e;
            if (list2 != null) {
                i = list2.size();
            }
            mo26907A(z2, i);
            notifyDataSetChanged();
        }
    }

    /* renamed from: t */
    public void mo26919t(CheckBox checkBox) {
        C0549e.m3395c(checkBox, new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{16842912}}, new int[]{C8343s.m46295c(R.color.menu_tint_color), C8343s.m46300h()}));
    }

    /* renamed from: v */
    public void mo26920v(List<Music> list) {
        this.f31110h = list;
    }

    /* renamed from: y */
    public void mo26921y(C7949b bVar) {
        this.f31109g = bVar;
    }

    /* renamed from: z */
    public void mo26922z(boolean z, long j) {
        m39978i(!C8287e.m45800P(), z, j);
        mo26917r(!C8287e.m45800P());
    }
}
