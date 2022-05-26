package coocent.music.player.widget.p275k;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.C0916y;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.coocent.music.base.data.entity.Music;
import com.coocent.music.base.data.entity.Playlist;
import com.coocent.music.base.p056ui.view.C2384h;
import com.coocent.music.base.p056ui.view.C2388i;
import coocent.music.player.adapter.PlaylistItemOptionAdapter;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.mode.C7058c;
import coocent.musiclibrary.music.p281b.C7324c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: coocent.music.player.widget.k.o0 */
/* compiled from: PlayelistItemOptionPopup */
public class C7234o0 extends C7217j0 {

    /* renamed from: k */
    private List<C7058c> f31944k = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Activity f31945l;

    /* renamed from: m */
    private View f31946m;

    /* renamed from: n */
    private RecyclerView f31947n;

    /* renamed from: o */
    private ImageView f31948o;

    /* renamed from: p */
    private TextView f31949p;

    /* renamed from: q */
    private ImageView f31950q;

    /* renamed from: r */
    private PlaylistItemOptionAdapter f31951r;

    /* renamed from: s */
    private TextView f31952s;

    /* renamed from: t */
    private List<Music> f31953t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f31954u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C7324c f31955v;

    /* renamed from: w */
    protected int f31956w;

    /* renamed from: x */
    private TextView f31957x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public Playlist f31958y;

    /* renamed from: coocent.music.player.widget.k.o0$a */
    /* compiled from: PlayelistItemOptionPopup */
    class C7235a implements C2388i {
        C7235a() {
        }

        /* renamed from: a */
        public void mo9365a(Dialog dialog, long j, String str) {
            C7234o0.this.f31945l.sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.play_rename_notify"));
        }

        /* renamed from: b */
        public void mo9366b(Dialog dialog) {
            dialog.dismiss();
        }
    }

    /* renamed from: coocent.music.player.widget.k.o0$b */
    /* compiled from: PlayelistItemOptionPopup */
    private static class C7236b extends AsyncTask<Void, Void, Integer> {

        /* renamed from: a */
        WeakReference<C7234o0> f31960a;

        /* synthetic */ C7236b(C7234o0 o0Var, C7235a aVar) {
            this(o0Var);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(Void... voidArr) {
            C7234o0 o0Var = (C7234o0) this.f31960a.get();
            if (o0Var == null) {
                return null;
            }
            try {
                return Integer.valueOf(C4477c.m19629l(o0Var.f31945l, o0Var.f31958y.mo9239e()));
            } catch (Exception e) {
                e.printStackTrace();
                return -4;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Integer num) {
            C7234o0 o0Var = (C7234o0) this.f31960a.get();
            if (o0Var == null) {
                return;
            }
            if (num.intValue() > 0) {
                if (o0Var.f31955v != null) {
                    o0Var.f31955v.mo28062f((Music) null);
                }
                Toast.makeText(o0Var.f31945l, R.string.music_eq_lbl_delete_file_success, 0).show();
                if (o0Var.f31956w == 1) {
                    Intent intent = new Intent("media.musicplayer.audioplayer.videoplayer.playlist_list_favorite_change");
                    intent.putExtra("position", o0Var.f31954u);
                    C8345u.m46327h().sendBroadcast(intent);
                }
            } else if (num.intValue() == -4) {
                Toast.makeText(o0Var.f31945l, R.string.coocent_msgs_operation_failure, 0).show();
            }
        }

        private C7236b(C7234o0 o0Var) {
            this.f31960a = new WeakReference<>(o0Var);
        }
    }

    public C7234o0(Activity activity, int i) {
        super(activity);
        this.f31945l = activity;
        this.f31956w = i;
        m41036s();
        m41028D();
    }

    /* renamed from: A */
    private void m41027A() {
        Activity activity = this.f31945l;
        if (activity != null) {
            C2384h.C2385a aVar = new C2384h.C2385a(activity, this.f31958y.mo9239e());
            aVar.mo9353n(C8345u.m46333n(R.string.rename));
            aVar.mo9352l(this.f31958y.mo9242g());
            aVar.mo9350j(C8343s.m46300h());
            aVar.mo9351k(new C7235a());
            aVar.mo9348b().show();
        }
        dismiss();
    }

    /* renamed from: D */
    private void m41028D() {
        this.f31951r.setOnItemClickListener(new C7246r(this));
        C7244q qVar = new C7244q(this);
        this.f31948o.setOnClickListener(qVar);
        this.f31952s.setOnClickListener(qVar);
    }

    /* renamed from: F */
    private void m41029F() {
        setWidth(C8345u.m46331l());
        setHeight(-2);
        if (BaseApplication.f31159w) {
            boolean z = BaseApplication.f31158v;
        }
        setContentView(this.f31946m);
        setFocusable(true);
        setOutsideTouchable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setAnimationStyle(R.style.nowplaylist);
    }

    /* renamed from: q */
    private void m41034q(C7234o0 o0Var) {
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f31945l);
            builder.setTitle(R.string.coocent_delete);
            builder.setMessage(R.string.music_eq_confirm_delete_playlist);
            builder.setPositiveButton(17039370, new C7248s(o0Var));
            builder.setNegativeButton(R.string.cancel, C7253t.f32042g);
            builder.create().show();
            dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: r */
    private void m41035r(String[] strArr) {
        this.f31944k.clear();
        for (int i = 0; i < strArr.length; i++) {
            C7058c cVar = new C7058c();
            cVar.mo27085b(i);
            cVar.mo27086c(strArr[i]);
            this.f31944k.add(cVar);
        }
    }

    /* renamed from: s */
    private void m41036s() {
        this.f31946m = LayoutInflater.from(this.f31945l).inflate(R.layout.option_list, (ViewGroup) null);
        m41029F();
        this.f31950q = (ImageView) this.f31946m.findViewById(R.id.iv_play_backgroud);
        this.f31947n = (RecyclerView) this.f31946m.findViewById(R.id.recyclerview);
        this.f31948o = (ImageView) this.f31946m.findViewById(R.id.popu_back);
        this.f31949p = (TextView) this.f31946m.findViewById(R.id.option_title);
        this.f31952s = (TextView) this.f31946m.findViewById(R.id.tv_cancel);
        ((C0916y) this.f31947n.getItemAnimator()).mo5428V(false);
        this.f31947n.setLayoutManager(new GridLayoutManager(this.f31945l, 3));
        m41035r(C8345u.m46325f(R.array.playlist_item_option_2));
        PlaylistItemOptionAdapter playlistItemOptionAdapter = new PlaylistItemOptionAdapter(R.layout.item_option, this.f31944k);
        this.f31951r = playlistItemOptionAdapter;
        playlistItemOptionAdapter.setHasStableIds(true);
        this.f31947n.setAdapter(this.f31951r);
        this.f31949p.setTextColor(C8343s.m46295c(R.color.default_text_color));
        this.f31949p.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.f31957x = (TextView) this.f31946m.findViewById(R.id.option_sub_title);
        this.f31946m.findViewById(R.id.cover_view).setVisibility(C8343s.f34787b ? 0 : 8);
        C8343s.m46311s(this.f31950q, false);
        this.f31952s.setTextColor(C8343s.m46295c(R.color.default_text_color));
        View findViewById = this.f31946m.findViewById(R.id.top_line);
        View findViewById2 = this.f31946m.findViewById(R.id.bottom_line);
        findViewById.setBackgroundColor(C8343s.m46295c(R.color.popup_line));
        findViewById2.setBackgroundColor(C8343s.m46295c(R.color.popup_line));
    }

    /* renamed from: u */
    static /* synthetic */ void m41038u(DialogInterface dialogInterface, int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void mo27790w(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        if (i == 0) {
            m41041z();
        } else if (i == 1) {
            m41027A();
        } else if (i == 2) {
            m41034q(this);
        }
        dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void mo27791y(View view) {
        int id = view.getId();
        if (id == R.id.popu_back || id == R.id.tv_cancel) {
            dismiss();
        }
    }

    /* renamed from: z */
    private void m41041z() {
        List<Music> list = this.f31953t;
        if (list != null && list.size() > 0) {
            C8287e.m45858n0(true);
            C8287e.m45823a0(0, this.f31953t);
            dismiss();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: B */
    public void mo27786B() {
        try {
            this.f31949p.setText(this.f31958y.mo9242g());
            if (this.f31958y.mo9243h() > 1) {
                TextView textView = this.f31957x;
                textView.setText(BuildConfig.FLAVOR + this.f31958y.mo9243h() + " " + C8345u.m46333n(R.string.counttracks));
            } else {
                TextView textView2 = this.f31957x;
                textView2.setText(BuildConfig.FLAVOR + this.f31958y.mo9243h() + " " + C8345u.m46333n(R.string.counttrack));
            }
            mo27789p();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: C */
    public void mo27787C(int i, Playlist playlist) {
        this.f31958y = playlist;
        this.f31954u = i;
        this.f31953t = C4477c.m19591P(C8345u.m46327h(), playlist.mo9239e());
        m41035r(C8345u.m46325f(R.array.playlist_item_option_2));
        this.f31947n.setLayoutManager(new GridLayoutManager(this.f31945l, 3));
        this.f31951r.notifyDataSetChanged();
    }

    /* renamed from: E */
    public void mo27788E(C7324c cVar) {
        this.f31955v = cVar;
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
        mo27786B();
    }

    /* renamed from: p */
    public void mo27789p() {
    }
}
