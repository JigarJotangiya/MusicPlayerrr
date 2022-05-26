package p159f.p166c.p201g.p205m;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Arrays;
import java.util.List;
import p159f.p166c.p171b.p172a.C4315c;
import p159f.p166c.p171b.p174c.C4318a;
import p159f.p166c.p201g.C4511f;
import p159f.p166c.p201g.C4512g;
import p159f.p166c.p201g.C4513h;
import p159f.p166c.p201g.p204l.C4546b;
import p159f.p166c.p201g.p207o.C4563a;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.c.g.m.d */
/* compiled from: SavePresetDialog */
public class C4555d extends Dialog implements View.OnClickListener {

    /* renamed from: g */
    private ViewGroup f13222g;

    /* renamed from: h */
    private TextView f13223h;

    /* renamed from: i */
    private TextView f13224i;

    /* renamed from: j */
    private TextView f13225j;

    /* renamed from: k */
    private TextView f13226k;

    /* renamed from: l */
    private EditText f13227l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Context f13228m;

    /* renamed from: n */
    private int[] f13229n;

    /* renamed from: o */
    private C4563a f13230o;

    /* renamed from: f.c.g.m.d$a */
    /* compiled from: SavePresetDialog */
    class C4556a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ View f13231g;

        C4556a(View view) {
            this.f13231g = view;
        }

        public void run() {
            InputMethodManager inputMethodManager;
            if (C4555d.this.f13228m != null && (inputMethodManager = (InputMethodManager) C4555d.this.f13228m.getSystemService("input_method")) != null) {
                inputMethodManager.showSoftInput(this.f13231g, 1);
            }
        }
    }

    public C4555d(Context context, int[] iArr) {
        super(context);
        this.f13228m = context;
        this.f13229n = iArr;
    }

    /* renamed from: b */
    private void m19847b(View view) {
        this.f13222g = (ViewGroup) view.findViewById(C4511f.dialog_layout);
        this.f13223h = (TextView) view.findViewById(C4511f.tv_title);
        this.f13224i = (TextView) view.findViewById(C4511f.tv_delete);
        this.f13225j = (TextView) view.findViewById(C4511f.tv_cancel);
        this.f13226k = (TextView) view.findViewById(C4511f.tv_save);
        this.f13227l = (EditText) view.findViewById(C4511f.et_input);
        this.f13225j.setOnClickListener(this);
        this.f13226k.setOnClickListener(this);
        this.f13227l.setText(BuildConfig.FLAVOR);
        m19849n(this.f13227l);
        this.f13223h.setText(C4513h.effect_save);
        this.f13224i.setVisibility(8);
    }

    /* renamed from: d */
    private void m19848d() {
        String trim = this.f13227l.getText().toString().trim();
        if (TextUtils.isEmpty(trim)) {
            Toast.makeText(this.f13228m, C4513h.name_not_null, 0).show();
        } else if (trim.length() >= 80) {
            Toast.makeText(this.f13228m, C4513h.name_max_length, 0).show();
        } else {
            C4318a aVar = new C4318a(this.f13228m, new C4546b(this.f13228m));
            List<C4315c> c = aVar.mo14733c();
            for (int i = 0; i < c.size(); i++) {
                if (c.get(i).mo14714c().trim().equals(trim)) {
                    Toast.makeText(this.f13228m, C4513h.name_duplicate, 0).show();
                    return;
                }
            }
            C4315c cVar = new C4315c();
            cVar.mo14721j(trim);
            int[] iArr = this.f13229n;
            cVar.mo14724m(Arrays.copyOf(iArr, iArr.length));
            int b = aVar.mo14732b(cVar);
            if (b < 0) {
                Toast.makeText(this.f13228m, C4513h.effect_fail, 0).show();
            } else {
                Toast.makeText(this.f13228m, C4513h.effect_success, 0).show();
                cVar.mo14720i(b);
                C4563a aVar2 = this.f13230o;
                if (aVar2 != null) {
                    aVar2.mo9515E(cVar);
                }
            }
            dismiss();
        }
    }

    /* renamed from: n */
    private void m19849n(View view) {
        if (view != null) {
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            view.postDelayed(new C4556a(view), 300);
        }
    }

    /* renamed from: f */
    public C4555d mo15255f(C4563a aVar) {
        this.f13230o = aVar;
        return this;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C4511f.tv_cancel) {
            dismiss();
        } else if (id == C4511f.tv_save) {
            m19848d();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        View inflate = LayoutInflater.from(getContext()).inflate(C4512g.dialog_save_preset, (ViewGroup) null);
        setContentView(inflate);
        m19847b(inflate);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        getWindow().setGravity(17);
        getWindow().setLayout(-1, -2);
    }
}
