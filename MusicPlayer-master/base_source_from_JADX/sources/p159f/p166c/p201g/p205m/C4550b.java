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
import java.util.List;
import p159f.p166c.p171b.p172a.C4315c;
import p159f.p166c.p171b.p174c.C4318a;
import p159f.p166c.p201g.C4511f;
import p159f.p166c.p201g.C4512g;
import p159f.p166c.p201g.C4513h;
import p159f.p166c.p201g.p204l.C4546b;
import p159f.p166c.p201g.p207o.C4563a;

/* renamed from: f.c.g.m.b */
/* compiled from: RenamePresetDialog */
public class C4550b extends Dialog implements View.OnClickListener {

    /* renamed from: g */
    private ViewGroup f13206g;

    /* renamed from: h */
    private TextView f13207h;

    /* renamed from: i */
    private TextView f13208i;

    /* renamed from: j */
    private TextView f13209j;

    /* renamed from: k */
    private TextView f13210k;

    /* renamed from: l */
    private EditText f13211l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Context f13212m;

    /* renamed from: n */
    private int f13213n;

    /* renamed from: o */
    private C4315c f13214o;

    /* renamed from: p */
    private C4563a f13215p;

    /* renamed from: f.c.g.m.b$a */
    /* compiled from: RenamePresetDialog */
    class C4551a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ View f13216g;

        C4551a(View view) {
            this.f13216g = view;
        }

        public void run() {
            InputMethodManager inputMethodManager;
            if (C4550b.this.f13212m != null && (inputMethodManager = (InputMethodManager) C4550b.this.f13212m.getSystemService("input_method")) != null) {
                inputMethodManager.showSoftInput(this.f13216g, 1);
            }
        }
    }

    public C4550b(Context context, int i, C4315c cVar) {
        super(context);
        this.f13212m = context;
        this.f13213n = i;
        this.f13214o = cVar;
    }

    /* renamed from: b */
    private void m19837b() {
        new C4318a(this.f13212m, new C4546b(this.f13212m)).mo14731a(this.f13214o.mo14713b());
        Toast.makeText(this.f13212m, C4513h.effect_success, 0).show();
        C4563a aVar = this.f13215p;
        if (aVar != null) {
            aVar.mo9516g1(this.f13213n, this.f13214o);
        }
        dismiss();
    }

    /* renamed from: d */
    private void m19838d(View view) {
        this.f13206g = (ViewGroup) view.findViewById(C4511f.dialog_layout);
        this.f13207h = (TextView) view.findViewById(C4511f.tv_title);
        this.f13208i = (TextView) view.findViewById(C4511f.tv_delete);
        this.f13209j = (TextView) view.findViewById(C4511f.tv_cancel);
        this.f13210k = (TextView) view.findViewById(C4511f.tv_save);
        this.f13211l = (EditText) view.findViewById(C4511f.et_input);
        this.f13208i.setOnClickListener(this);
        this.f13209j.setOnClickListener(this);
        this.f13210k.setOnClickListener(this);
        this.f13211l.setText(this.f13214o.mo14714c());
        this.f13211l.setSelection(this.f13214o.mo14714c().length());
        m19840o(this.f13211l);
        this.f13207h.setText(C4513h.effect_edit);
    }

    /* renamed from: f */
    private void m19839f() {
        String trim = this.f13211l.getText().toString().trim();
        if (TextUtils.isEmpty(trim)) {
            Toast.makeText(this.f13212m, C4513h.name_not_null, 0).show();
        } else if (trim.length() >= 80) {
            Toast.makeText(this.f13212m, C4513h.name_max_length, 0).show();
        } else {
            C4318a aVar = new C4318a(this.f13212m, new C4546b(this.f13212m));
            List<C4315c> c = aVar.mo14733c();
            for (int i = 0; i < c.size(); i++) {
                if (c.get(i).mo14714c().trim().equals(trim)) {
                    Toast.makeText(this.f13212m, C4513h.name_duplicate, 0).show();
                    return;
                }
            }
            aVar.mo14734d(this.f13214o.mo14713b(), trim);
            Toast.makeText(this.f13212m, C4513h.effect_success, 0).show();
            C4563a aVar2 = this.f13215p;
            if (aVar2 != null) {
                aVar2.mo9517o1(this.f13213n, this.f13214o, trim);
            }
            dismiss();
        }
    }

    /* renamed from: o */
    private void m19840o(View view) {
        if (view != null) {
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            view.postDelayed(new C4551a(view), 300);
        }
    }

    /* renamed from: n */
    public C4550b mo15249n(C4563a aVar) {
        this.f13215p = aVar;
        return this;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C4511f.tv_cancel) {
            dismiss();
        } else if (id == C4511f.tv_save) {
            m19839f();
        } else if (id == C4511f.tv_delete) {
            m19837b();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        View inflate = LayoutInflater.from(getContext()).inflate(C4512g.dialog_save_preset, (ViewGroup) null);
        setContentView(inflate);
        m19838d(inflate);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        getWindow().setGravity(17);
        getWindow().setLayout(-1, -2);
    }
}
