package coocent.music.player.widget.p275k;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
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
import com.coocent.music.base.data.entity.Album;
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

/* renamed from: coocent.music.player.widget.k.h0 */
/* compiled from: AlbumItemOptionPopup */
public class C7209h0 extends C7217j0 {

    /* renamed from: k */
    private final int f31848k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f31849l = -1;

    /* renamed from: m */
    private List<C7058c> f31850m = new ArrayList();

    /* renamed from: n */
    private Context f31851n;

    /* renamed from: o */
    private View f31852o;

    /* renamed from: p */
    private RecyclerView f31853p;

    /* renamed from: q */
    private ImageView f31854q;

    /* renamed from: r */
    private TextView f31855r;

    /* renamed from: s */
    private ImageView f31856s;

    /* renamed from: t */
    private ArtistItemOptionAdapter f31857t;

    /* renamed from: u */
    private TextView f31858u;

    /* renamed from: v */
    private List<Music> f31859v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f31860w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C7324c f31861x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public Album f31862y;

    /* renamed from: z */
    private TextView f31863z;

    /* renamed from: coocent.music.player.widget.k.h0$a */
    /* compiled from: AlbumItemOptionPopup */
    class C7210a implements C7332e.C7334b {

        /* renamed from: a */
        final /* synthetic */ C7332e f31864a;

        C7210a(C7332e eVar) {
            this.f31864a = eVar;
        }

        /* renamed from: a */
        public void mo26720a() {
            if (C7209h0.this.f31861x != null) {
                C7324c l = C7209h0.this.f31861x;
                int o = C7209h0.this.f31849l;
                long f = C7209h0.this.f31862y.mo9139f();
                int n = C7209h0.this.f31860w;
                l.mo28061D(o, f, n, "album " + C7209h0.this.f31862y.mo9141h());
            }
            this.f31864a.dismiss();
        }

        /* renamed from: b */
        public void mo26721b() {
            if (C7209h0.this.f31861x != null) {
                C7209h0.this.f31861x.mo28063r(C7209h0.this.f31862y.mo9139f(), C7209h0.this.f31860w);
            }
            this.f31864a.dismiss();
        }

        /* renamed from: c */
        public void mo26722c() {
            if (C7209h0.this.f31861x != null) {
                C7324c l = C7209h0.this.f31861x;
                int o = C7209h0.this.f31849l;
                long f = C7209h0.this.f31862y.mo9139f();
                int n = C7209h0.this.f31860w;
                l.mo28065u(o, f, n, "album " + C7209h0.this.f31862y.mo9141h());
            }
            this.f31864a.dismiss();
        }
    }

    /* renamed from: coocent.music.player.widget.k.h0$b */
    /* compiled from: AlbumItemOptionPopup */
    class C7211b implements C4379d.C4380a {
        C7211b() {
        }

        /* renamed from: a */
        public void mo14943a() {
        }

        /* renamed from: b */
        public void mo14944b(List<Long> list) {
            C7209h0.this.f31861x.mo28062f((Music) null);
        }

        /* renamed from: c */
        public void mo14945c(int i, int i2, long j) {
            C7209h0.this.f31861x.mo28066x(j);
        }
    }

    public C7209h0(Context context, int i, int i2) {
        super(context);
        this.f31849l = i;
        this.f31848k = i2;
        this.f31851n = context;
        m40896x();
        m40882I();
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void mo27737C(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        if (i == 0) {
            m40881F();
        } else if (i == 1) {
            m40890q();
        } else if (i == 2) {
            m40889p();
        } else if (i == 3) {
            m40891r();
        } else if (i == 4) {
            m40892t();
        } else if (i == 5) {
            m40893u();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void mo27738E(View view) {
        int id = view.getId();
        if (id == R.id.popu_back || id == R.id.tv_cancel) {
            dismiss();
        }
    }

    /* renamed from: F */
    private void m40881F() {
        List<Music> list = this.f31859v;
        if (list != null && list.size() > 0) {
            C8287e.m45858n0(true);
            C8287e.m45823a0(0, this.f31859v);
            dismiss();
        }
    }

    /* renamed from: I */
    private void m40882I() {
        this.f31857t.setOnItemClickListener(new C7194a(this));
        C7200d dVar = new C7200d(this);
        this.f31854q.setOnClickListener(dVar);
        this.f31858u.setOnClickListener(dVar);
    }

    /* renamed from: K */
    private void m40883K() {
        setWidth(C8345u.m46331l());
        setHeight(-2);
        if (BaseApplication.f31159w) {
            boolean z = BaseApplication.f31158v;
        }
        setContentView(this.f31852o);
        setFocusable(true);
        setOutsideTouchable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setAnimationStyle(R.style.nowplaylist);
    }

    /* renamed from: L */
    private void m40884L() {
        try {
            Context context = this.f31851n;
            C7332e eVar = new C7332e(context, context.getResources().getString(R.string.button1), this.f31851n.getResources().getString(R.string.button2), this.f31851n.getResources().getString(R.string.button3), this.f31851n.getResources().getString(R.string.artist_work), this.f31851n.getResources().getString(R.string.artist_work_tip), C8343s.m46300h(), C8345u.m46326g(R.color.color_bbb), this.f31851n.getResources().getColor(R.color.white), false, true);
            eVar.requestWindowFeature(1);
            eVar.show();
            eVar.mo28071c(new C7210a(eVar));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: p */
    private void m40889p() {
        long[] jArr = new long[this.f31859v.size()];
        for (int i = 0; i < this.f31859v.size(); i++) {
            jArr[i] = this.f31859v.get(i).mo9215k();
        }
        C7985h.m43692r3(jArr, true).mo3841h3(((FragmentActivity) this.f31851n).mo3730H1(), "ADD_PLAYLIST");
        dismiss();
    }

    /* renamed from: q */
    private void m40890q() {
        C8287e.m45834e(this.f31859v);
        dismiss();
    }

    /* renamed from: r */
    private void m40891r() {
        m40884L();
        dismiss();
    }

    /* renamed from: t */
    private void m40892t() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f31851n);
        builder.setTitle(R.string.delete).setMessage(R.string.music_eq_confirm_delete_album).setPositiveButton(17039370, new C7198c(this)).setNegativeButton(17039360, C7196b.f31834g);
        builder.create().show();
        dismiss();
    }

    /* renamed from: u */
    private void m40893u() {
        int O0 = C4477c.m19590O0(C8345u.m46327h(), this.f31862y.mo9139f());
        if (O0 == -4) {
            C8344t.m46316d(C8345u.m46327h(), R.string.error);
        } else if (O0 == 1) {
            C8344t.m46316d(C8345u.m46327h(), R.string.add_album_to_favorite);
        } else if (O0 == 2) {
            if (this.f31848k == 1) {
                Intent intent = new Intent("media.musicplayer.audioplayer.videoplayer.album_list_favorite_change");
                intent.putExtra("position", this.f31860w);
                C8345u.m46327h().sendBroadcast(intent);
                dismiss();
            }
            C8344t.m46316d(C8345u.m46327h(), R.string.remove_album_from_favorite);
        }
        this.f31857t.notifyDataSetChanged();
    }

    /* renamed from: v */
    private void m40894v() {
        String[] f = C8345u.m46325f(R.array.artist_item_option);
        for (int i = 0; i < f.length; i++) {
            C7058c cVar = new C7058c();
            cVar.mo27085b(i);
            cVar.mo27086c(f[i]);
            this.f31850m.add(cVar);
        }
    }

    /* renamed from: w */
    private String m40895w(Album album) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(album.mo9140g());
        sb.append(" ");
        if (album.mo9140g() > 1) {
            str = C8345u.m46327h().getResources().getString(R.string.music_eq_songs);
        } else {
            str = C8345u.m46327h().getResources().getString(R.string.music_eq_song);
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: x */
    private void m40896x() {
        this.f31852o = LayoutInflater.from(this.f31851n).inflate(R.layout.option_list, (ViewGroup) null);
        m40883K();
        this.f31856s = (ImageView) this.f31852o.findViewById(R.id.iv_play_backgroud);
        this.f31853p = (RecyclerView) this.f31852o.findViewById(R.id.recyclerview);
        this.f31854q = (ImageView) this.f31852o.findViewById(R.id.popu_back);
        TextView textView = (TextView) this.f31852o.findViewById(R.id.option_title);
        this.f31855r = textView;
        textView.setTextColor(C8343s.m46295c(R.color.default_text_color));
        this.f31855r.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.f31858u = (TextView) this.f31852o.findViewById(R.id.tv_cancel);
        ((C0916y) this.f31853p.getItemAnimator()).mo5428V(false);
        this.f31853p.setLayoutManager(new GridLayoutManager(this.f31851n, 3));
        m40894v();
        ArtistItemOptionAdapter artistItemOptionAdapter = new ArtistItemOptionAdapter(R.layout.item_option, this.f31850m);
        this.f31857t = artistItemOptionAdapter;
        artistItemOptionAdapter.setHasStableIds(true);
        this.f31853p.setAdapter(this.f31857t);
        this.f31863z = (TextView) this.f31852o.findViewById(R.id.option_sub_title);
        this.f31852o.findViewById(R.id.cover_view).setVisibility(C8343s.f34787b ? 0 : 8);
        C8343s.m46311s(this.f31856s, false);
        this.f31858u.setTextColor(C8343s.m46295c(R.color.default_text_color));
        View findViewById = this.f31852o.findViewById(R.id.top_line);
        View findViewById2 = this.f31852o.findViewById(R.id.bottom_line);
        findViewById.setBackgroundColor(C8343s.m46295c(R.color.popup_line));
        findViewById2.setBackgroundColor(C8343s.m46295c(R.color.popup_line));
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void mo27745z(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        C4477c.m19623i(this.f31851n, this.f31862y.mo9139f(), new C7211b());
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: G */
    public void mo27739G() {
        try {
            this.f31855r.setText(this.f31862y.mo9141h());
            TextView textView = this.f31863z;
            textView.setText(m40895w(this.f31862y) + " · " + this.f31862y.mo9137e());
            mo27744s();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: H */
    public void mo27740H(int i, Album album) {
        this.f31862y = album;
        this.f31857t.mo26885e(album.mo9139f(), this.f31849l);
        this.f31860w = i;
        this.f31859v = C4477c.m19635o(C8345u.m46327h(), album.mo9139f());
        this.f31857t.notifyItemChanged(ArtistItemOptionAdapter.f31091c);
    }

    /* renamed from: J */
    public void mo27741J(C7324c cVar) {
        this.f31861x = cVar;
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
        mo27739G();
    }

    /* renamed from: s */
    public void mo27744s() {
    }
}
