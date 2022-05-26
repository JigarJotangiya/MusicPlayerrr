package coocent.music.player.widget.p275k;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C0916y;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.coocent.music.base.data.entity.Music;
import coocent.music.player.adapter.TrackItemOptionAdapter;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.mode.C7058c;
import coocent.musiclibrary.music.p281b.C7322a;
import coocent.musiclibrary.music.p281b.C7324c;
import coocent.musiclibrary.music.p284e.C7340g;
import coocent.musiclibrary.music.p292j.C7382d;
import java.util.ArrayList;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p166c.p181e.p182a.p183a.p184a.C4363c;
import p159f.p166c.p181e.p182a.p183a.p187d.C4379d;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p348e.C7985h;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8344t;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: coocent.music.player.widget.k.s0 */
/* compiled from: TrackItemOptionPopup */
public class C7249s0 extends C7217j0 implements C4363c {

    /* renamed from: k */
    private int f32023k = -1;

    /* renamed from: l */
    private int f32024l = 0;

    /* renamed from: m */
    private List<C7058c> f32025m = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Activity f32026n;

    /* renamed from: o */
    private View f32027o;

    /* renamed from: p */
    private RecyclerView f32028p;

    /* renamed from: q */
    private TextView f32029q;

    /* renamed from: r */
    private TrackItemOptionAdapter f32030r;

    /* renamed from: s */
    private TextView f32031s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public List<Music> f32032t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f32033u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C7324c f32034v;

    /* renamed from: w */
    private TextView f32035w;

    /* renamed from: x */
    private long f32036x = -1;

    /* renamed from: coocent.music.player.widget.k.s0$a */
    /* compiled from: TrackItemOptionPopup */
    class C7250a implements C7322a {

        /* renamed from: a */
        final /* synthetic */ long[] f32037a;

        /* renamed from: coocent.music.player.widget.k.s0$a$a */
        /* compiled from: TrackItemOptionPopup */
        class C7251a implements C4379d.C4380a {
            C7251a() {
            }

            /* renamed from: a */
            public void mo14943a() {
                C8344t.m46316d(C7249s0.this.f32026n, R.string.music_eq_lbl_delete_file_failed);
            }

            /* renamed from: b */
            public void mo14944b(List<Long> list) {
                C7249s0.this.f32034v.mo28066x(list.get(0).longValue());
                C7249s0.this.f32034v.mo28062f((Music) C7249s0.this.f32032t.get(C7249s0.this.f32033u));
            }

            /* renamed from: c */
            public void mo14945c(int i, int i2, long j) {
            }
        }

        C7250a(long[] jArr) {
            this.f32037a = jArr;
        }

        /* renamed from: a */
        public void mo26686a(DialogInterface dialogInterface) {
            C4477c.m19627k(C7249s0.this.f32026n, this.f32037a, new C7251a());
        }

        /* renamed from: b */
        public void mo26687b(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: coocent.music.player.widget.k.s0$b */
    /* compiled from: TrackItemOptionPopup */
    class C7252b implements C7340g.C7342b {

        /* renamed from: a */
        final /* synthetic */ Music f32040a;

        C7252b(Music music) {
            this.f32040a = music;
        }

        /* renamed from: a */
        public void mo27784a(Dialog dialog, String str, String str2, String str3) {
            C4477c.m19600T0(C7249s0.this.f32026n, this.f32040a.mo9215k(), this.f32040a.mo9218n(), str, str2, str3, C7249s0.this);
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.detail_update_page").setPackage(C8345u.m46327h().getPackageName()));
            dialog.dismiss();
        }

        /* renamed from: b */
        public void mo27785b(Dialog dialog) {
            dialog.dismiss();
        }
    }

    public C7249s0(Activity activity, int i, int i2) {
        super(activity);
        this.f32023k = i;
        this.f32024l = i2;
        this.f32026n = activity;
        m41144w();
        m41130I();
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void mo27826B(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        switch (i) {
            case 0:
                m41128E();
                return;
            case 1:
                m41139q();
                return;
            case 2:
                m41138p();
                return;
            case 3:
                m41133N();
                return;
            case 4:
                m41141t();
                return;
            case 5:
                m41142u();
                return;
            case 6:
                m41132M();
                return;
            case 7:
                if (this.f32036x != -1) {
                    m41129F();
                    return;
                } else {
                    m41140s();
                    return;
                }
            default:
                return;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void mo27827D(View view) {
        if (view.getId() == R.id.tv_cancel) {
            dismiss();
        }
    }

    /* renamed from: E */
    private void m41128E() {
        C8287e.m45818Y(this.f32032t.get(this.f32033u));
        C8344t.m46317e(C8345u.m46327h(), C8345u.m46327h().getResources().getString(R.string.success_add_to_next));
        dismiss();
    }

    /* renamed from: F */
    private void m41129F() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f32026n);
        builder.setMessage(R.string.remove_from_playlist).setPositiveButton(17039370, new C7201d0(this)).setNegativeButton(17039360, C7203e0.f31841g);
        AlertDialog create = builder.create();
        create.show();
        create.getButton(-1).setTextColor(C8343s.m46300h());
        create.getButton(-2).setTextColor(C8343s.m46300h());
        dismiss();
    }

    /* renamed from: I */
    private void m41130I() {
        this.f32030r.setOnItemClickListener(new C7199c0(this));
        this.f32031s.setOnClickListener(new C7197b0(this));
    }

    /* renamed from: L */
    private void m41131L() {
        setWidth(C8345u.m46331l());
        setHeight(-2);
        if (BaseApplication.f31159w) {
            boolean z = BaseApplication.f31158v;
        }
        setContentView(this.f32027o);
        setFocusable(true);
        setOutsideTouchable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setAnimationStyle(R.style.nowplaylist);
    }

    /* renamed from: M */
    private void m41132M() {
        C7382d.m41677h(this.f32026n, this.f32032t.get(this.f32033u).mo9215k());
        dismiss();
    }

    /* renamed from: N */
    private void m41133N() {
        Music music = this.f32032t.get(this.f32033u);
        if (music != null) {
            C8287e.m45822a(this.f32026n, music);
        } else {
            C8344t.m46316d(this.f32026n, R.string.not_found);
        }
        dismiss();
    }

    /* renamed from: p */
    private void m41138p() {
        try {
            C7985h.m43691q3(this.f32032t.get(this.f32033u)).mo3841h3(((FragmentActivity) this.f32026n).mo3730H1(), "ADD_PLAYLIST");
            dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: q */
    private void m41139q() {
        C8287e.m45831d(this.f32032t.get(this.f32033u), true);
        dismiss();
    }

    /* renamed from: s */
    private void m41140s() {
        try {
            long[] jArr = {this.f32032t.get(this.f32033u).mo9215k()};
            C7382d.m41679j(this.f32026n, this.f32032t.get(this.f32033u).mo9218n(), jArr, C8343s.m46300h(), C8345u.m46326g(R.color.white), C8345u.m46326g(R.color.color_bbb), new C7250a(jArr));
        } catch (Exception e) {
            e.printStackTrace();
        }
        dismiss();
    }

    /* renamed from: t */
    private void m41141t() {
        Music music = this.f32032t.get(this.f32033u);
        if (music != null) {
            C7382d.m41680k(this.f32026n, music, C8345u.m46326g(R.color.white), -16777216, -16777216, false, new C7252b(music));
        }
        dismiss();
    }

    /* renamed from: u */
    private void m41142u() {
        int Q0 = C4477c.m19594Q0(C8345u.m46327h(), this.f32032t.get(this.f32033u).mo9215k());
        if (Q0 == 1) {
            this.f32030r.notifyDataSetChanged();
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.music_change_favorite").setPackage(C8345u.m46327h().getPackageName()));
            Toast.makeText(C8345u.m46327h(), R.string.add_to_favorite, 0).show();
        } else if (Q0 == 2) {
            this.f32030r.notifyDataSetChanged();
            if (this.f32024l == 1) {
                Intent intent = new Intent("media.musicplayer.audioplayer.videoplayer.playlist_detail_list_favorite_change");
                intent.putExtra("position", this.f32033u);
                C8345u.m46327h().sendBroadcast(intent.setPackage(C8345u.m46327h().getPackageName()));
                C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.music_change_favorite").setPackage(C8345u.m46327h().getPackageName()));
                dismiss();
            }
            Toast.makeText(C8345u.m46327h(), R.string.remove_from_favorite, 0).show();
        } else {
            Toast.makeText(C8345u.m46327h(), R.string.error, 0).show();
        }
        try {
            if (C8287e.m45873v().mo9215k() == this.f32032t.get(this.f32033u).mo9215k()) {
                C8287e.m45820Z();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: v */
    private void m41143v() {
        String[] strArr;
        if (this.f32023k != 7) {
            strArr = C8345u.m46325f(R.array.track_item_option);
        } else {
            strArr = C8345u.m46325f(R.array.playlist_track_item_option);
        }
        for (int i = 0; i < strArr.length; i++) {
            C7058c cVar = new C7058c();
            cVar.mo27085b(i);
            cVar.mo27086c(strArr[i]);
            this.f32025m.add(cVar);
        }
    }

    /* renamed from: w */
    private void m41144w() {
        this.f32027o = LayoutInflater.from(this.f32026n).inflate(R.layout.option_list, (ViewGroup) null);
        m41131L();
        mo27832r();
        this.f32028p = (RecyclerView) this.f32027o.findViewById(R.id.recyclerview);
        TextView textView = (TextView) this.f32027o.findViewById(R.id.option_title);
        this.f32029q = textView;
        textView.setTextColor(C8343s.m46295c(R.color.default_text_color));
        this.f32029q.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.f32035w = (TextView) this.f32027o.findViewById(R.id.option_sub_title);
        this.f32031s = (TextView) this.f32027o.findViewById(R.id.tv_cancel);
        ((C0916y) this.f32028p.getItemAnimator()).mo5428V(false);
        this.f32028p.setLayoutManager(new GridLayoutManager(this.f32026n, 4));
        m41143v();
        TrackItemOptionAdapter trackItemOptionAdapter = new TrackItemOptionAdapter(R.layout.item_option, this.f32025m, this.f32023k);
        this.f32030r = trackItemOptionAdapter;
        trackItemOptionAdapter.setHasStableIds(true);
        this.f32028p.setAdapter(this.f32030r);
        this.f32027o.findViewById(R.id.cover_view).setVisibility(C8343s.f34787b ? 0 : 8);
        C8343s.m46311s((ImageView) this.f32027o.findViewById(R.id.iv_play_backgroud), false);
        this.f32031s.setTextColor(C8343s.m46295c(R.color.default_text_color));
        View findViewById = this.f32027o.findViewById(R.id.top_line);
        View findViewById2 = this.f32027o.findViewById(R.id.bottom_line);
        findViewById.setBackgroundColor(C8343s.m46295c(R.color.popup_line));
        findViewById2.setBackgroundColor(C8343s.m46295c(R.color.popup_line));
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void mo27833y(DialogInterface dialogInterface, int i) {
        C4477c.m19624i0(this.f32026n, new long[]{this.f32032t.get(this.f32033u).mo9215k()}, this.f32036x);
        this.f32026n.sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.playlist_detail_remove_notify").setPackage(C8345u.m46327h().getPackageName()).setPackage(C8345u.m46327h().getPackageName()));
    }

    /* renamed from: G */
    public void mo27828G() {
        try {
            this.f32029q.setText(this.f32032t.get(this.f32033u).mo9218n());
            this.f32035w.setText(this.f32032t.get(this.f32033u).mo9210g());
            mo27832r();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: H */
    public void mo27829H(int i, List<Music> list) {
        this.f32033u = i;
        this.f32032t = list;
        this.f32030r.mo26924d(list.get(i));
    }

    /* renamed from: J */
    public void mo27830J(C7324c cVar) {
        this.f32034v = cVar;
    }

    /* renamed from: K */
    public void mo27831K(long j) {
        this.f32036x = j;
    }

    /* renamed from: a */
    public void mo14801a(boolean z, long j, String str, String str2, String str3) {
        if (z && this.f32034v != null) {
            Music music = new Music();
            music.mo9231y(j);
            music.mo9202C(str);
            music.mo9223s(str2);
            music.mo9224t(str3);
            this.f32034v.mo28062f(music);
        }
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
        mo27828G();
    }

    /* renamed from: r */
    public void mo27832r() {
    }
}
