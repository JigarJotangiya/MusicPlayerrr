package coocent.music.player.widget.p275k;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C0916y;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.coocent.music.base.data.entity.Artist;
import com.coocent.music.base.data.entity.Music;
import coocent.music.player.adapter.ArtistItemOptionAdapter;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.mode.C7058c;
import coocent.musiclibrary.music.p281b.C7324c;
import coocent.musiclibrary.music.p284e.C7332e;
import java.util.ArrayList;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p166c.p181e.p182a.p183a.p187d.C4379d;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p348e.C7985h;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8344t;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: coocent.music.player.widget.k.i0 */
/* compiled from: ArtistItemOptionPopup */
public class C7213i0 extends C7217j0 {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f31868k = -1;

    /* renamed from: l */
    private List<C7058c> f31869l = new ArrayList();

    /* renamed from: m */
    private Activity f31870m;

    /* renamed from: n */
    private View f31871n;

    /* renamed from: o */
    private RecyclerView f31872o;

    /* renamed from: p */
    private ImageView f31873p;

    /* renamed from: q */
    private TextView f31874q;

    /* renamed from: r */
    private ImageView f31875r;

    /* renamed from: s */
    private ArtistItemOptionAdapter f31876s;

    /* renamed from: t */
    private TextView f31877t;

    /* renamed from: u */
    private List<Music> f31878u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f31879v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C7324c f31880w;

    /* renamed from: x */
    protected int f31881x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public Artist f31882y;

    /* renamed from: z */
    private TextView f31883z;

    /* renamed from: coocent.music.player.widget.k.i0$a */
    /* compiled from: ArtistItemOptionPopup */
    class C7214a implements C7332e.C7334b {

        /* renamed from: a */
        final /* synthetic */ C7332e f31884a;

        C7214a(C7332e eVar) {
            this.f31884a = eVar;
        }

        /* renamed from: a */
        public void mo26720a() {
            if (C7213i0.this.f31880w != null) {
                C7324c l = C7213i0.this.f31880w;
                int o = C7213i0.this.f31868k;
                long e = C7213i0.this.f31882y.mo9158e();
                int n = C7213i0.this.f31879v;
                l.mo28061D(o, e, n, "artist " + C7213i0.this.f31882y.mo9161g());
            }
            this.f31884a.dismiss();
        }

        /* renamed from: b */
        public void mo26721b() {
            if (C7213i0.this.f31880w != null) {
                C7213i0.this.f31880w.mo28063r(C7213i0.this.f31882y.mo9158e(), C7213i0.this.f31879v);
            }
            this.f31884a.dismiss();
        }

        /* renamed from: c */
        public void mo26722c() {
            if (C7213i0.this.f31880w != null) {
                C7324c l = C7213i0.this.f31880w;
                int o = C7213i0.this.f31868k;
                long e = C7213i0.this.f31882y.mo9158e();
                int n = C7213i0.this.f31879v;
                l.mo28065u(o, e, n, "artist " + C7213i0.this.f31882y.mo9161g());
            }
            this.f31884a.dismiss();
        }
    }

    /* renamed from: coocent.music.player.widget.k.i0$b */
    /* compiled from: ArtistItemOptionPopup */
    class C7215b implements C4379d.C4380a {
        C7215b() {
        }

        /* renamed from: a */
        public void mo14943a() {
        }

        /* renamed from: b */
        public void mo14944b(List<Long> list) {
            C7213i0.this.f31880w.mo28062f((Music) null);
        }

        /* renamed from: c */
        public void mo14945c(int i, int i2, long j) {
            C7213i0.this.f31880w.mo28066x(j);
        }
    }

    public C7213i0(Activity activity, int i, int i2) {
        super(activity);
        this.f31868k = i;
        this.f31881x = i2;
        this.f31870m = activity;
        m40932y();
        m40917J();
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void mo27748D(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        if (i == 0) {
            m40916G();
        } else if (i == 1) {
            m40925q();
        } else if (i == 2) {
            m40924p();
        } else if (i == 3) {
            m40926r();
        } else if (i == 4) {
            m40927t();
        } else if (i == 5) {
            m40928u();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void mo27749F(View view) {
        int id = view.getId();
        if (id == R.id.popu_back || id == R.id.tv_cancel) {
            dismiss();
        }
    }

    /* renamed from: G */
    private void m40916G() {
        List<Music> list = this.f31878u;
        if (list != null && list.size() > 0) {
            C8287e.m45858n0(true);
            C8287e.m45823a0(0, this.f31878u);
            dismiss();
        }
    }

    /* renamed from: J */
    private void m40917J() {
        this.f31876s.setOnItemClickListener(new C7202e(this));
        C7206g gVar = new C7206g(this);
        this.f31873p.setOnClickListener(gVar);
        this.f31877t.setOnClickListener(gVar);
    }

    /* renamed from: L */
    private void m40918L() {
        setWidth(C8345u.m46331l());
        setHeight(-2);
        if (BaseApplication.f31159w) {
            boolean z = BaseApplication.f31158v;
        }
        setContentView(this.f31871n);
        setFocusable(true);
        setOutsideTouchable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setAnimationStyle(R.style.nowplaylist);
    }

    /* renamed from: M */
    private void m40919M() {
        Activity activity = this.f31870m;
        C7332e eVar = new C7332e(activity, activity.getResources().getString(R.string.button1), this.f31870m.getResources().getString(R.string.button2), this.f31870m.getResources().getString(R.string.button3), this.f31870m.getResources().getString(R.string.artist_work), this.f31870m.getResources().getString(R.string.artist_work_tip), C8343s.m46300h(), C8345u.m46326g(R.color.color_bbb), this.f31870m.getResources().getColor(R.color.white), false, true);
        eVar.requestWindowFeature(1);
        eVar.show();
        eVar.mo28071c(new C7214a(eVar));
    }

    /* renamed from: p */
    private void m40924p() {
        long[] jArr = new long[this.f31878u.size()];
        for (int i = 0; i < this.f31878u.size(); i++) {
            jArr[i] = this.f31878u.get(i).mo9215k();
        }
        C7985h.m43692r3(jArr, true).mo3841h3(((FragmentActivity) this.f31870m).mo3730H1(), "ADD_PLAYLIST");
        dismiss();
    }

    /* renamed from: q */
    private void m40925q() {
        C8287e.m45834e(this.f31878u);
        dismiss();
    }

    /* renamed from: r */
    private void m40926r() {
        m40919M();
        dismiss();
    }

    /* renamed from: t */
    private void m40927t() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f31870m);
        builder.setTitle(R.string.delete).setMessage(R.string.music_eq_confirm_delete_artist).setPositiveButton(17039370, new C7208h(this)).setNegativeButton(17039360, C7204f.f31842g);
        builder.create().show();
        dismiss();
    }

    /* renamed from: u */
    private void m40928u() {
        int P0 = C4477c.m19592P0(C8345u.m46327h(), this.f31882y.mo9158e());
        if (P0 == -4) {
            C8344t.m46316d(C8345u.m46327h(), R.string.error);
        } else if (P0 == 1) {
            C8344t.m46316d(C8345u.m46327h(), R.string.add_artist_to_favorite);
        } else if (P0 == 2) {
            if (this.f31881x == 1) {
                Intent intent = new Intent("media.musicplayer.audioplayer.videoplayer.artist_list_favorite_change");
                intent.putExtra("position", this.f31879v);
                C8345u.m46327h().sendBroadcast(intent.setPackage(C8345u.m46327h().getPackageName()));
                dismiss();
            }
            C8344t.m46316d(C8345u.m46327h(), R.string.remove_artist_from_favorite);
        }
        this.f31876s.notifyDataSetChanged();
    }

    /* renamed from: v */
    private String m40929v(Artist artist) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(artist.mo9156d());
        sb.append(" ");
        if (artist.mo9156d() > 1) {
            str = C8345u.m46327h().getResources().getString(R.string.albums_counts);
        } else {
            str = C8345u.m46327h().getResources().getString(R.string.albums_count);
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: w */
    private void m40930w() {
        String[] f = C8345u.m46325f(R.array.artist_item_option);
        for (int i = 0; i < f.length; i++) {
            C7058c cVar = new C7058c();
            cVar.mo27085b(i);
            cVar.mo27086c(f[i]);
            this.f31869l.add(cVar);
        }
    }

    /* renamed from: x */
    private String m40931x(Artist artist) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(artist.mo9160f());
        sb.append(" ");
        if (artist.mo9160f() > 1) {
            str = C8345u.m46327h().getResources().getString(R.string.music_eq_songs);
        } else {
            str = C8345u.m46327h().getResources().getString(R.string.music_eq_song);
        }
        sb.append(str);
        return sb.toString();
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: y */
    private void m40932y() {
        this.f31871n = LayoutInflater.from(this.f31870m).inflate(R.layout.option_list, (ViewGroup) null);
        m40918L();
        this.f31875r = (ImageView) this.f31871n.findViewById(R.id.iv_play_backgroud);
        this.f31872o = (RecyclerView) this.f31871n.findViewById(R.id.recyclerview);
        this.f31873p = (ImageView) this.f31871n.findViewById(R.id.popu_back);
        TextView textView = (TextView) this.f31871n.findViewById(R.id.option_title);
        this.f31874q = textView;
        textView.setTextColor(C8343s.m46295c(R.color.default_text_color));
        this.f31874q.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.f31877t = (TextView) this.f31871n.findViewById(R.id.tv_cancel);
        ((C0916y) this.f31872o.getItemAnimator()).mo5428V(false);
        this.f31872o.setLayoutManager(new GridLayoutManager(this.f31870m, 3));
        m40930w();
        ArtistItemOptionAdapter artistItemOptionAdapter = new ArtistItemOptionAdapter(R.layout.item_option, this.f31869l);
        this.f31876s = artistItemOptionAdapter;
        artistItemOptionAdapter.setHasStableIds(true);
        this.f31872o.setAdapter(this.f31876s);
        this.f31883z = (TextView) this.f31871n.findViewById(R.id.option_sub_title);
        this.f31871n.findViewById(R.id.cover_view).setVisibility(C8343s.f34787b ? 0 : 8);
        C8343s.m46311s(this.f31875r, false);
        this.f31877t.setTextColor(C8343s.m46295c(R.color.default_text_color));
        View findViewById = this.f31871n.findViewById(R.id.top_line);
        View findViewById2 = this.f31871n.findViewById(R.id.bottom_line);
        findViewById.setBackgroundColor(C8343s.m46295c(R.color.popup_line));
        findViewById2.setBackgroundColor(C8343s.m46295c(R.color.popup_line));
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void mo27747A(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        C4477c.m19625j(this.f31870m, this.f31882y.mo9158e(), new C7215b());
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: H */
    public void mo27750H() {
        try {
            this.f31874q.setText(this.f31882y.mo9161g());
            TextView textView = this.f31883z;
            textView.setText(m40931x(this.f31882y) + "·" + m40929v(this.f31882y));
            mo27753s();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: I */
    public void mo27751I(int i, Artist artist) {
        this.f31882y = artist;
        this.f31876s.mo26885e(artist.mo9158e(), this.f31868k);
        this.f31879v = i;
        this.f31878u = C4477c.m19645t(C8345u.m46327h(), artist.mo9158e());
        this.f31876s.notifyItemChanged(ArtistItemOptionAdapter.f31091c);
    }

    /* renamed from: K */
    public void mo27752K(C7324c cVar) {
        this.f31880w = cVar;
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
        mo27750H();
    }

    /* renamed from: s */
    public void mo27753s() {
    }
}
