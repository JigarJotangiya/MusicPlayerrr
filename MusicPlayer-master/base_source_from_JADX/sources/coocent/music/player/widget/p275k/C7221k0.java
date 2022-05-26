package coocent.music.player.widget.p275k;

import android.annotation.SuppressLint;
import android.content.Context;
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
import com.coocent.music.base.data.entity.Folder;
import com.coocent.music.base.data.entity.Music;
import coocent.music.player.adapter.GenresItemOptionAdapter;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.mode.C7058c;
import coocent.musiclibrary.music.p281b.C7324c;
import java.util.ArrayList;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p348e.C7985h;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: coocent.music.player.widget.k.k0 */
/* compiled from: FolderItemOptionPopup */
public class C7221k0 extends C7217j0 {

    /* renamed from: k */
    private List<C7058c> f31895k = new ArrayList();

    /* renamed from: l */
    private Context f31896l;

    /* renamed from: m */
    private View f31897m;

    /* renamed from: n */
    private RecyclerView f31898n;

    /* renamed from: o */
    private ImageView f31899o;

    /* renamed from: p */
    private TextView f31900p;

    /* renamed from: q */
    private TextView f31901q;

    /* renamed from: r */
    private ImageView f31902r;

    /* renamed from: s */
    private GenresItemOptionAdapter f31903s;

    /* renamed from: t */
    private TextView f31904t;

    /* renamed from: u */
    private List<Music> f31905u;

    /* renamed from: v */
    private Folder f31906v;

    public C7221k0(Context context) {
        super(context);
        this.f31896l = context;
        m40961p();
        m40965x();
    }

    /* renamed from: l */
    private void m40958l() {
        try {
            List<Music> list = this.f31905u;
            if (list != null) {
                C7985h.m43692r3(C8287e.m45778E(list), true).mo3841h3(((FragmentActivity) this.f31896l).mo3730H1(), "ADD_PLAYLIST");
                dismiss();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: m */
    private void m40959m() {
        C8287e.m45834e(this.f31905u);
    }

    /* renamed from: o */
    private void m40960o() {
        String[] f = C8345u.m46325f(R.array.genres_item_option);
        for (int i = 0; i < f.length; i++) {
            C7058c cVar = new C7058c();
            cVar.mo27085b(i);
            cVar.mo27086c(f[i]);
            this.f31895k.add(cVar);
        }
    }

    /* renamed from: p */
    private void m40961p() {
        this.f31897m = LayoutInflater.from(this.f31896l).inflate(R.layout.option_list, (ViewGroup) null);
        m40966z();
        this.f31902r = (ImageView) this.f31897m.findViewById(R.id.iv_play_backgroud);
        this.f31898n = (RecyclerView) this.f31897m.findViewById(R.id.recyclerview);
        this.f31899o = (ImageView) this.f31897m.findViewById(R.id.popu_back);
        this.f31900p = (TextView) this.f31897m.findViewById(R.id.option_title);
        this.f31901q = (TextView) this.f31897m.findViewById(R.id.option_sub_title);
        this.f31904t = (TextView) this.f31897m.findViewById(R.id.tv_cancel);
        ((C0916y) this.f31898n.getItemAnimator()).mo5428V(false);
        this.f31898n.setLayoutManager(new GridLayoutManager(this.f31896l, 3));
        m40960o();
        GenresItemOptionAdapter genresItemOptionAdapter = new GenresItemOptionAdapter(R.layout.item_option, this.f31895k);
        this.f31903s = genresItemOptionAdapter;
        genresItemOptionAdapter.setHasStableIds(true);
        this.f31898n.setAdapter(this.f31903s);
        this.f31900p.setTextColor(C8343s.m46295c(R.color.default_text_color));
        this.f31900p.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.f31897m.findViewById(R.id.cover_view).setVisibility(C8343s.f34787b ? 0 : 8);
        C8343s.m46311s(this.f31902r, false);
        this.f31904t.setTextColor(C8343s.m46295c(R.color.default_text_color));
        View findViewById = this.f31897m.findViewById(R.id.top_line);
        View findViewById2 = this.f31897m.findViewById(R.id.bottom_line);
        findViewById.setBackgroundColor(C8343s.m46295c(R.color.popup_line));
        findViewById2.setBackgroundColor(C8343s.m46295c(R.color.popup_line));
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo27764r(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        if (i == 0) {
            m40964u();
        } else if (i == 1) {
            m40959m();
        } else if (i == 2) {
            m40958l();
        }
        dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void mo27765t(View view) {
        int id = view.getId();
        if (id == R.id.popu_back || id == R.id.tv_cancel) {
            dismiss();
        }
    }

    /* renamed from: u */
    private void m40964u() {
        List<Music> list = this.f31905u;
        if (list != null && list.size() > 0) {
            C8287e.m45858n0(true);
            C8287e.m45823a0(0, this.f31905u);
            dismiss();
        }
    }

    /* renamed from: x */
    private void m40965x() {
        this.f31903s.setOnItemClickListener(new C7222l(this));
        C7220k kVar = new C7220k(this);
        this.f31899o.setOnClickListener(kVar);
        this.f31904t.setOnClickListener(kVar);
    }

    /* renamed from: z */
    private void m40966z() {
        setWidth(C8345u.m46331l());
        setHeight(-2);
        if (BaseApplication.f31159w) {
            boolean z = BaseApplication.f31158v;
        }
        setContentView(this.f31897m);
        setFocusable(true);
        setOutsideTouchable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setAnimationStyle(R.style.nowplaylist);
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
        mo27766v();
    }

    /* renamed from: n */
    public void mo27763n() {
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: v */
    public void mo27766v() {
        String str;
        try {
            this.f31900p.setText(this.f31906v.mo9175e());
            if (this.f31906v.mo9173d() > 1) {
                str = this.f31906v.mo9173d() + " " + C8345u.m46333n(R.string.counttracks);
            } else {
                str = this.f31906v.mo9173d() + " " + C8345u.m46333n(R.string.counttrack);
            }
            this.f31901q.setText(str + "·" + this.f31906v.mo9177f());
            mo27763n();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: w */
    public void mo27767w(Folder folder) {
        this.f31906v = folder;
        this.f31905u = C4477c.m19569E(C8345u.m46327h(), folder.mo9177f());
    }

    /* renamed from: y */
    public void mo27768y(C7324c cVar) {
    }
}
