package coocent.music.player.widget.p275k;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
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

/* renamed from: coocent.music.player.widget.k.l0 */
/* compiled from: GenresItemOptionPopup */
public class C7223l0 extends C7217j0 {

    /* renamed from: k */
    private List<C7058c> f31908k = new ArrayList();

    /* renamed from: l */
    private Context f31909l;

    /* renamed from: m */
    private View f31910m;

    /* renamed from: n */
    private RecyclerView f31911n;

    /* renamed from: o */
    private ImageView f31912o;

    /* renamed from: p */
    private TextView f31913p;

    /* renamed from: q */
    private ImageView f31914q;

    /* renamed from: r */
    private GenresItemOptionAdapter f31915r;

    /* renamed from: s */
    private TextView f31916s;

    /* renamed from: t */
    private List<Music> f31917t;

    /* renamed from: u */
    private String f31918u;

    /* renamed from: coocent.music.player.widget.k.l0$a */
    /* compiled from: GenresItemOptionPopup */
    class C7224a implements BaseQuickAdapter.OnItemClickListener {
        C7224a() {
        }

        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            if (i == 0) {
                C7223l0.this.m40980r();
            } else if (i == 1) {
                C7223l0.this.m40977n();
            }
            C7223l0.this.dismiss();
        }
    }

    /* renamed from: coocent.music.player.widget.k.l0$b */
    /* compiled from: GenresItemOptionPopup */
    class C7225b implements View.OnClickListener {
        C7225b() {
        }

        public void onClick(View view) {
            int id = view.getId();
            if (id == R.id.popu_back || id == R.id.tv_cancel) {
                C7223l0.this.dismiss();
            }
        }
    }

    public C7223l0(Context context) {
        super(context);
        this.f31909l = context;
        m40979q();
        m40981u();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m40977n() {
        C7985h.m43692r3(C8287e.m45778E(this.f31917t), true).mo3841h3(((FragmentActivity) this.f31909l).mo3730H1(), "ADD_PLAYLIST");
        dismiss();
    }

    /* renamed from: p */
    private void m40978p() {
        String[] f = C8345u.m46325f(R.array.genres_item_option);
        for (int i = 0; i < f.length; i++) {
            C7058c cVar = new C7058c();
            cVar.mo27085b(i);
            cVar.mo27086c(f[i]);
            this.f31908k.add(cVar);
        }
    }

    /* renamed from: q */
    private void m40979q() {
        this.f31910m = LayoutInflater.from(this.f31909l).inflate(R.layout.option_list, (ViewGroup) null);
        m40982w();
        this.f31914q = (ImageView) this.f31910m.findViewById(R.id.iv_play_backgroud);
        this.f31911n = (RecyclerView) this.f31910m.findViewById(R.id.recyclerview);
        this.f31912o = (ImageView) this.f31910m.findViewById(R.id.popu_back);
        this.f31913p = (TextView) this.f31910m.findViewById(R.id.option_title);
        this.f31916s = (TextView) this.f31910m.findViewById(R.id.tv_cancel);
        ((C0916y) this.f31911n.getItemAnimator()).mo5428V(false);
        this.f31911n.setLayoutManager(new GridLayoutManager(this.f31909l, 2));
        m40978p();
        GenresItemOptionAdapter genresItemOptionAdapter = new GenresItemOptionAdapter(R.layout.item_option, this.f31908k);
        this.f31915r = genresItemOptionAdapter;
        genresItemOptionAdapter.setHasStableIds(true);
        this.f31911n.setAdapter(this.f31915r);
        this.f31910m.findViewById(R.id.cover_view).setVisibility(C8343s.f34787b ? 0 : 8);
        C8343s.m46311s(this.f31914q, false);
        this.f31916s.setTextColor(C8343s.m46295c(R.color.default_text_color));
        View findViewById = this.f31910m.findViewById(R.id.top_line);
        View findViewById2 = this.f31910m.findViewById(R.id.bottom_line);
        findViewById.setBackgroundColor(C8343s.m46295c(R.color.popup_line));
        findViewById2.setBackgroundColor(C8343s.m46295c(R.color.popup_line));
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m40980r() {
        List<Music> list = this.f31917t;
        if (list != null && list.size() > 0) {
            C8287e.m45858n0(true);
            C8287e.m45823a0(0, this.f31917t);
            dismiss();
        }
    }

    /* renamed from: u */
    private void m40981u() {
        this.f31915r.setOnItemClickListener(new C7224a());
        C7225b bVar = new C7225b();
        this.f31912o.setOnClickListener(bVar);
        this.f31916s.setOnClickListener(bVar);
    }

    /* renamed from: w */
    private void m40982w() {
        setWidth(C8345u.m46331l());
        setHeight(-2);
        if (BaseApplication.f31159w) {
            boolean z = BaseApplication.f31158v;
        }
        setContentView(this.f31910m);
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
        mo27770s();
    }

    /* renamed from: o */
    public void mo27769o() {
    }

    /* renamed from: s */
    public void mo27770s() {
        try {
            this.f31913p.setText(this.f31918u);
            mo27769o();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: t */
    public void mo27771t(long j, String str) {
        this.f31918u = str;
        this.f31917t = C4477c.m19577I(C8345u.m46327h(), j);
    }

    /* renamed from: v */
    public void mo27772v(C7324c cVar) {
    }
}
