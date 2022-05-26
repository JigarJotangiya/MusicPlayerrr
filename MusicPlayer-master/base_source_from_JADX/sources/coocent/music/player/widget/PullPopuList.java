package coocent.music.player.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import coocent.music.player.adapter.C7027j;
import coocent.music.player.widget.C7186f;
import coocent.musiclibrary.music.model.C7408a;
import coocent.musiclibrary.music.p292j.C7397j;
import java.util.Arrays;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p160a.p161a.C4264b;
import p159f.p160a.p161a.C4269f;
import p342g.p343a.p344a.p346c.C7951d;
import p342g.p343a.p344a.p346c.C7955h;
import p342g.p343a.p344a.p346c.C7957j;
import p342g.p343a.p344a.p347d.C7972b;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8344t;
import p342g.p343a.p344a.p358i.C8345u;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class PullPopuList extends RelativeLayout {

    /* renamed from: g */
    private View f31623g;

    /* renamed from: h */
    public TextView f31624h;

    /* renamed from: i */
    public ImageView f31625i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public PopupWindow f31626j;

    /* renamed from: k */
    public int f31627k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C7972b f31628l;

    /* renamed from: m */
    public float[] f31629m = new float[10];

    /* renamed from: n */
    public C7951d f31630n;

    /* renamed from: o */
    View.OnClickListener f31631o = new C7146a();

    /* renamed from: p */
    public List<C7408a> f31632p = null;

    /* renamed from: q */
    public List<C7408a> f31633q = null;

    /* renamed from: r */
    C7027j f31634r = null;

    /* renamed from: coocent.music.player.widget.PullPopuList$a */
    class C7146a implements View.OnClickListener {
        C7146a() {
        }

        public void onClick(View view) {
            if (PullPopuList.this.f31626j == null) {
                PullPopuList.this.m40726j();
            }
            if (PullPopuList.this.f31626j.isShowing()) {
                PullPopuList.this.f31626j.dismiss();
                return;
            }
            try {
                PullPopuList.this.f31626j.showAsDropDown(view, C7397j.m41731a(PullPopuList.this.getContext(), 3), 0);
            } catch (Exception unused) {
                PullPopuList.this.f31626j.showAsDropDown(view);
            }
            if (PullPopuList.this.f31624h.getText().toString().equals("Custom")) {
                PullPopuList.this.f31634r.mo26935i(true);
            } else {
                PullPopuList.this.f31634r.mo26935i(false);
            }
            PullPopuList.this.f31634r.notifyDataSetChanged();
        }
    }

    /* renamed from: coocent.music.player.widget.PullPopuList$b */
    class C7147b implements PopupWindow.OnDismissListener {
        C7147b(PullPopuList pullPopuList) {
        }

        public void onDismiss() {
        }
    }

    /* renamed from: coocent.music.player.widget.PullPopuList$c */
    class C7148c implements C7955h {
        C7148c() {
        }

        /* renamed from: a */
        public void mo27566a(int i) {
            if (PullPopuList.this.f31624h.getText().toString().equals("Custom")) {
                if (i == 0) {
                    PullPopuList.this.mo27560m();
                    return;
                }
                i--;
            }
            PullPopuList pullPopuList = PullPopuList.this;
            pullPopuList.f31627k = i;
            pullPopuList.f31624h.setText(pullPopuList.f31632p.get(i).mo28248b());
            PullPopuList.this.mo27556e(i);
            PullPopuList.this.f31626j.dismiss();
            PullPopuList.this.f31624h.setTextColor(-1);
            PullPopuList.this.m40727l(true);
        }
    }

    /* renamed from: coocent.music.player.widget.PullPopuList$d */
    class C7149d implements C7957j {
        C7149d() {
        }

        /* renamed from: a */
        public void mo27567a(int i) {
            if (PullPopuList.this.f31624h.getText().toString().equals("Custom")) {
                if (i != 0) {
                    i--;
                } else {
                    return;
                }
            }
            PullPopuList.this.mo27561n(i);
        }
    }

    /* renamed from: coocent.music.player.widget.PullPopuList$e */
    class C7150e implements View.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ Dialog f31638g;

        C7150e(PullPopuList pullPopuList, Dialog dialog) {
            this.f31638g = dialog;
        }

        public void onClick(View view) {
            this.f31638g.dismiss();
        }
    }

    /* renamed from: coocent.music.player.widget.PullPopuList$f */
    class C7151f implements View.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ EditText f31639g;

        /* renamed from: h */
        final /* synthetic */ Dialog f31640h;

        C7151f(EditText editText, Dialog dialog) {
            this.f31639g = editText;
            this.f31640h = dialog;
        }

        public void onClick(View view) {
            String obj = this.f31639g.getText().toString();
            if (obj == null || obj.isEmpty()) {
                C8344t.m46317e(C8345u.m46327h(), "The equalizer preset name can not be null.");
            } else if (obj.length() >= 80) {
                C8344t.m46317e(C8345u.m46327h(), "The equalizer preset name can not more then 80 words.");
            } else {
                C7408a aVar = new C7408a();
                aVar.mo28252e(obj);
                float[] fArr = new float[10];
                System.arraycopy(PullPopuList.this.f31629m, 0, fArr, 0, 10);
                aVar.mo28253f(fArr);
                int d = new C7972b(C8345u.m46327h()).mo29502d(aVar);
                if (d < 0) {
                    C8344t.m46317e(C8345u.m46327h(), "Fail");
                } else {
                    aVar.mo28251d(d);
                    PullPopuList.this.f31632p.add(aVar);
                    PullPopuList.this.f31633q.add(aVar);
                    PullPopuList.this.f31624h.setText(obj);
                    PullPopuList pullPopuList = PullPopuList.this;
                    pullPopuList.f31634r.notifyItemInserted(pullPopuList.f31632p.size() - 1);
                    C8344t.m46317e(C8345u.m46327h(), "Success");
                }
                this.f31640h.dismiss();
                if (PullPopuList.this.f31626j.isShowing()) {
                    PullPopuList.this.f31626j.dismiss();
                    PullPopuList.this.f31624h.setTextColor(-1);
                }
            }
        }
    }

    /* renamed from: coocent.music.player.widget.PullPopuList$g */
    class C7152g implements C7186f.C7188b {

        /* renamed from: a */
        final /* synthetic */ int f31642a;

        /* renamed from: b */
        final /* synthetic */ C7186f f31643b;

        /* renamed from: coocent.music.player.widget.PullPopuList$g$a */
        class C7153a implements C4269f.C4283m {
            C7153a(C7152g gVar) {
            }

            /* renamed from: a */
            public void mo6880a(C4269f fVar, C4264b bVar) {
                fVar.dismiss();
            }
        }

        /* renamed from: coocent.music.player.widget.PullPopuList$g$b */
        class C7154b implements C4269f.C4283m {
            C7154b() {
            }

            /* renamed from: a */
            public void mo6880a(C4269f fVar, C4264b bVar) {
                Context context = PullPopuList.this.getContext();
                C7152g gVar = C7152g.this;
                PullPopuList pullPopuList = PullPopuList.this;
                C7972b.m43644b(context, pullPopuList.f31624h, pullPopuList.f31632p, pullPopuList.f31634r, gVar.f31642a);
                PullPopuList.this.f31632p.clear();
                PullPopuList pullPopuList2 = PullPopuList.this;
                pullPopuList2.f31632p.addAll(pullPopuList2.f31628l.mo29501c());
                PullPopuList pullPopuList3 = PullPopuList.this;
                pullPopuList3.f31633q.addAll(pullPopuList3.f31628l.mo29501c());
            }
        }

        C7152g(int i, C7186f fVar) {
            this.f31642a = i;
            this.f31643b = fVar;
        }

        /* renamed from: a */
        public void mo27570a() {
            this.f31643b.dismiss();
            C4269f.C4274d dVar = new C4269f.C4274d(PullPopuList.this.getContext());
            dVar.mo14622I(R.string.delete_preset_tip);
            dVar.mo14631f(C8345u.m46333n(R.string.delete_preset_tips) + PullPopuList.this.f31632p.get(this.f31642a).mo28248b() + " ?");
            dVar.mo14620G(PullPopuList.this.getResources().getString(R.string.delete));
            dVar.mo14649x(PullPopuList.this.getResources().getString(R.string.cancel));
            dVar.mo14616C(new C7154b());
            dVar.mo14615B(new C7153a(this));
            dVar.mo14621H();
        }

        /* renamed from: b */
        public void mo27571b(String str, EditText editText) {
            if (!editText.getText().toString().equals(BuildConfig.FLAVOR)) {
                try {
                    if (PullPopuList.this.f31624h.getText().toString().equals(PullPopuList.this.f31632p.get(this.f31642a).mo28248b())) {
                        PullPopuList.this.f31624h.setText(editText.getText().toString());
                    }
                    PullPopuList.this.f31628l.mo29503e(PullPopuList.this.f31632p.get(this.f31642a).mo28247a(), editText.getText().toString());
                    PullPopuList.this.f31632p.get(this.f31642a).mo28252e(editText.getText().toString());
                    PullPopuList.this.f31634r.notifyDataSetChanged();
                    InputMethodManager inputMethodManager = (InputMethodManager) PullPopuList.this.getContext().getSystemService("input_method");
                    if (inputMethodManager.isActive()) {
                        inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                    }
                    this.f31643b.dismiss();
                    Toast.makeText(PullPopuList.this.getContext(), R.string.success, 0).show();
                } catch (Exception unused) {
                }
            }
        }
    }

    public PullPopuList(Context context) {
        super(context);
    }

    /* renamed from: h */
    private void m40724h() {
        View inflate = View.inflate(getContext(), R.layout.view_pull_popu_list, this);
        this.f31623g = inflate;
        this.f31624h = (TextView) inflate.findViewById(R.id.preset_text);
        this.f31625i = (ImageView) this.f31623g.findViewById(R.id.preset_bg);
    }

    /* renamed from: i */
    private void m40725i() {
        C7972b bVar = new C7972b(C8345u.m46327h());
        this.f31628l = bVar;
        this.f31632p = bVar.mo29501c();
        this.f31633q = this.f31628l.mo29501c();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m40726j() {
        if (this.f31626j == null) {
            View inflate = View.inflate(getContext(), R.layout.preset_list_layout, (ViewGroup) null);
            PopupWindow popupWindow = new PopupWindow(inflate, this.f31625i.getWidth() - C7397j.m41731a(getContext(), 6), (int) (C7397j.f32506c * 280.0f));
            this.f31626j = popupWindow;
            popupWindow.setOutsideTouchable(true);
            this.f31626j.setTouchable(true);
            this.f31626j.setBackgroundDrawable(new ColorDrawable());
            this.f31626j.setFocusable(true);
            this.f31626j.setAnimationStyle(R.style.popwin_anim_style);
            this.f31626j.setOnDismissListener(new C7147b(this));
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recyclerView);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            recyclerView.setHasFixedSize(true);
            recyclerView.mo4622h(new C7191h(C8345u.m46327h(), 1));
            C7027j jVar = new C7027j(this.f31632p);
            this.f31634r = jVar;
            jVar.mo26933g(new C7148c());
            this.f31634r.mo26934h(new C7149d());
            recyclerView.setAdapter(this.f31634r);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m40727l(boolean z) {
        if (z) {
            new C8337n(getContext()).mo30101G2(-1);
        }
    }

    /* renamed from: e */
    public void mo27556e(int i) {
        List<C7408a> list = this.f31632p;
        if (list != null) {
            list.clear();
            this.f31632p.addAll(this.f31628l.mo29501c());
        } else {
            this.f31632p = this.f31628l.mo29501c();
        }
        this.f31630n.mo29481a(i, this.f31632p.get(i).mo28249c());
    }

    /* renamed from: f */
    public void mo27557f(boolean z) {
        C8337n nVar = new C8337n(getContext());
        int O = nVar.mo30130O();
        this.f31627k = O;
        if (O < 0) {
            this.f31629m[0] = nVar.mo30208h();
            this.f31629m[1] = nVar.mo30216j();
            this.f31629m[2] = nVar.mo30220k();
            this.f31629m[3] = nVar.mo30223l();
            this.f31629m[4] = nVar.mo30227m();
            this.f31629m[5] = nVar.mo30231n();
            this.f31629m[6] = nVar.mo30235o();
            this.f31629m[7] = nVar.mo30239p();
            this.f31629m[8] = nVar.mo30243q();
            this.f31629m[9] = nVar.mo30212i();
        } else {
            this.f31629m = this.f31632p.get(O).mo28249c();
        }
        if (z) {
            mo27558g();
        }
        this.f31630n.mo29482q(this.f31629m);
    }

    /* renamed from: g */
    public void mo27558g() {
        List<C7408a> list = this.f31633q;
        if (list != null && list.size() > 0) {
            String arrays = Arrays.toString(this.f31629m);
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f31633q.size()) {
                    break;
                } else if (arrays.equals(Arrays.toString(this.f31633q.get(i).mo28249c()))) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                this.f31624h.setText("Custom");
            } else {
                this.f31624h.setText(this.f31633q.get(i).mo28248b());
            }
        }
    }

    /* renamed from: k */
    public void mo27559k() {
        m40724h();
        m40725i();
        mo27557f(true);
        setOnClickListener(this.f31631o);
    }

    /* renamed from: m */
    public void mo27560m() {
        if (this.f31632p != null) {
            String arrays = Arrays.toString(this.f31629m);
            List<C7408a> list = this.f31632p;
            if (list != null) {
                list.clear();
                this.f31632p.addAll(this.f31628l.mo29501c());
            } else {
                this.f31632p = this.f31628l.mo29501c();
            }
            for (int i = 0; i < this.f31632p.size(); i++) {
                if (arrays.equals(Arrays.toString(this.f31632p.get(i).mo28249c()))) {
                    Toast.makeText(getContext(), "The preset value has duplicate with $name.".replace("$name", this.f31632p.get(i).mo28248b()), 0).show();
                    return;
                }
            }
            Dialog dialog = new Dialog(getContext(), R.style.MyDialog);
            dialog.show();
            dialog.setCanceledOnTouchOutside(false);
            Window window = dialog.getWindow();
            window.setBackgroundDrawable(new ColorDrawable());
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.save_preset, (ViewGroup) null);
            window.setContentView(inflate);
            EditText editText = (EditText) inflate.findViewById(R.id.rename_etv);
            editText.requestFocus();
            ((TextView) inflate.findViewById(R.id.cancel)).setOnClickListener(new C7150e(this, dialog));
            ((TextView) inflate.findViewById(R.id.save)).findViewById(R.id.save).setOnClickListener(new C7151f(editText, dialog));
        }
    }

    /* renamed from: n */
    public void mo27561n(int i) {
        C7186f fVar = new C7186f(getContext(), this.f31632p.get(i).mo28248b());
        fVar.requestWindowFeature(1);
        fVar.show();
        fVar.mo27719c(new C7152g(i, fVar));
    }

    public void setPresetCallBack(C7951d dVar) {
        this.f31630n = dVar;
    }

    public void setPullViewEnabled(boolean z) {
        this.f31625i.setEnabled(z);
        this.f31624h.setEnabled(z);
        setEnabled(z);
    }

    public PullPopuList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PullPopuList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
