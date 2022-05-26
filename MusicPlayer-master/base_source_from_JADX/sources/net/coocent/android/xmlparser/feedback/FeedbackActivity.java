package net.coocent.android.xmlparser.feedback;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.C0133c;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.C0672f0;
import androidx.lifecycle.C0703o0;
import androidx.lifecycle.C0712q0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import net.coocent.android.xmlparser.feedback.C9409i;
import net.coocent.android.xmlparser.feedback.C9419l;
import net.coocent.android.xmlparser.p461z.C9565e;
import net.coocent.android.xmlparser.p461z.C9566f;
import p082e.p109h.p110h.C3621a;
import p391j.p392a.p393a.C8612e;
import p391j.p392a.p393a.C8614g;
import p391j.p392a.p393a.C8615h;
import p391j.p392a.p393a.C8616i;
import p391j.p392a.p393a.C8617j;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class FeedbackActivity extends AppCompatActivity implements View.OnClickListener {

    /* renamed from: A */
    private AppCompatButton f36271A;

    /* renamed from: B */
    private RecyclerView f36272B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C9409i f36273C;

    /* renamed from: D */
    private C9419l f36274D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public ProgressDialog f36275E;

    /* renamed from: F */
    private int f36276F;

    /* renamed from: G */
    private final TextWatcher f36277G = new C9397a();

    /* renamed from: H */
    private final C9409i.C9411b f36278H = new C9398b();

    /* renamed from: z */
    private AppCompatEditText f36279z;

    /* renamed from: net.coocent.android.xmlparser.feedback.FeedbackActivity$a */
    class C9397a implements TextWatcher {
        C9397a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            FeedbackActivity.this.m49664n2();
        }
    }

    /* renamed from: net.coocent.android.xmlparser.feedback.FeedbackActivity$b */
    class C9398b implements C9409i.C9411b {
        C9398b() {
        }

        /* renamed from: a */
        public void mo32507a(String str, int i) {
        }

        /* renamed from: b */
        public void mo32508b(int i) {
            try {
                Intent intent = new Intent(Build.VERSION.SDK_INT >= 19 ? "android.intent.action.OPEN_DOCUMENT" : "android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("image/*");
                intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
                FeedbackActivity.this.startActivityForResult(intent, 17960);
            } catch (Exception e) {
                e.printStackTrace();
                Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
                intent2.addCategory("android.intent.category.OPENABLE");
                intent2.setType("image/*");
                intent2.putExtra("android.intent.extra.LOCAL_ONLY", true);
                FeedbackActivity.this.startActivityForResult(intent2, 17960);
            }
        }

        /* renamed from: c */
        public void mo32509c(int i) {
            FeedbackActivity.this.f36273C.mo32524j(i);
            FeedbackActivity.this.m49664n2();
        }
    }

    /* renamed from: net.coocent.android.xmlparser.feedback.FeedbackActivity$c */
    class C9399c extends RecyclerView.C0808o {

        /* renamed from: a */
        final /* synthetic */ int f36282a;

        C9399c(FeedbackActivity feedbackActivity, int i) {
            this.f36282a = i;
        }

        /* renamed from: d */
        public void mo4874d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0826z zVar) {
            super.mo4874d(rect, view, recyclerView, zVar);
            RecyclerView.C0809p layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && recyclerView.getAdapter() != null) {
                int n2 = ((LinearLayoutManager) layoutManager).mo4498n2();
                int g0 = recyclerView.mo4600g0(view);
                if (n2 == 0) {
                    int i = this.f36282a;
                    int i2 = i / 2;
                    rect.top = i;
                    rect.bottom = i;
                    rect.right = g0 == recyclerView.getAdapter().getItemCount() ? this.f36282a : i2;
                    if (g0 == 0) {
                        i2 = this.f36282a;
                    }
                    rect.left = i2;
                }
            }
        }
    }

    /* renamed from: net.coocent.android.xmlparser.feedback.FeedbackActivity$d */
    class C9400d implements C0672f0<Integer> {
        C9400d() {
        }

        /* renamed from: a */
        public void onChanged(Integer num) {
            if (FeedbackActivity.this.f36275E != null) {
                FeedbackActivity.this.f36275E.dismiss();
            }
            if (num == null) {
                Toast.makeText(FeedbackActivity.this, C8616i.feedback_failed, 0).show();
            } else if (num.intValue() == 0) {
                Toast.makeText(FeedbackActivity.this, C8616i.coocent_your_feedback_useful, 0).show();
                FeedbackActivity.this.finish();
            } else if (num.intValue() == -1) {
                Toast.makeText(FeedbackActivity.this, C8616i.feedback_failed, 0).show();
            }
        }
    }

    /* renamed from: h2 */
    public static void m49660h2(Context context, int i) {
        Intent intent = new Intent(context, FeedbackActivity.class);
        intent.putExtra("ui_mode", i);
        context.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public /* synthetic */ void mo32500j2(DialogInterface dialogInterface, int i) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public /* synthetic */ void mo32501m2(DialogInterface dialogInterface) {
        this.f36274D.mo32534g();
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public void m49664n2() {
        boolean z = false;
        boolean z2 = this.f36279z.getText() == null || TextUtils.isEmpty(this.f36279z.getText().toString());
        AppCompatButton appCompatButton = this.f36271A;
        if (this.f36273C.getItemCount() > 1 || !z2) {
            z = true;
        }
        appCompatButton.setEnabled(z);
    }

    /* renamed from: o2 */
    private void m49665o2() {
        Window window = getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            int l = C9566f.m50201l(this, 16842836);
            window.setStatusBarColor(C3621a.m15595m(l, 51));
            window.setNavigationBarColor(C3621a.m15595m(l, 51));
            if (i >= 23) {
                window.setStatusBarColor(l);
            }
            if (i >= 26) {
                window.setNavigationBarColor(l);
            }
        } else if (i >= 19) {
            window.addFlags(201326592);
        }
    }

    /* renamed from: p2 */
    private void m49666p2() {
        C9419l lVar = (C9419l) new C0703o0((C0712q0) this, (C0703o0.C0705b) new C9419l.C9421b(getApplication())).mo4262a(C9419l.class);
        this.f36274D = lVar;
        lVar.mo32535h().mo4149h(this, new C9400d());
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 17960 && intent != null && intent.getData() != null) {
            this.f36273C.mo32519d(intent.getData().toString());
            this.f36272B.mo4702y1(this.f36273C.getItemCount() - 1);
            this.f36271A.setEnabled(true);
        }
    }

    public void onBackPressed() {
        ProgressDialog progressDialog = this.f36275E;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f36275E.dismiss();
            this.f36274D.mo32534g();
        } else if (this.f36271A.isEnabled()) {
            C0133c.C0134a aVar = new C0133c.C0134a(this, this.f36276F);
            aVar.mo644o(C8616i.coocent_leave_this_page);
            aVar.mo636g(C8616i.coocent_leave_this_page_message);
            aVar.mo641l(17039370, new C9402b(this));
            aVar.mo638i(17039360, C9401a.f36284g);
            aVar.mo647r();
        } else {
            super.onBackPressed();
        }
    }

    public void onClick(View view) {
        if (view.getId() != C8614g.btn_submit) {
            return;
        }
        if (!C9565e.m50189a(this)) {
            Toast.makeText(this, C8616i.coocent_no_network, 0).show();
            return;
        }
        String obj = this.f36279z.getText() != null ? this.f36279z.getText().toString() : BuildConfig.FLAVOR;
        ArrayList arrayList = new ArrayList();
        for (String next : this.f36273C.mo32521g()) {
            if (!TextUtils.isEmpty(next)) {
                arrayList.add(next);
            }
        }
        this.f36274D.mo32536i(arrayList, obj);
        ProgressDialog progressDialog = this.f36275E;
        if (progressDialog == null) {
            ProgressDialog show = ProgressDialog.show(this, getString(C8616i.coocent_send_feedback), getString(C8616i.coocent_please_wait), true, true, new C9403c(this));
            this.f36275E = show;
            show.setCanceledOnTouchOutside(false);
            return;
        }
        progressDialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int i;
        int intExtra = getIntent().getIntExtra("ui_mode", -1);
        if (intExtra == 1) {
            i = C8617j.Promotion_Feedback_Light;
            this.f36276F = C8617j.Promotion_Feedback_Light_Dialog;
        } else if (intExtra == 2) {
            i = C8617j.Promotion_Feedback_Night;
            this.f36276F = C8617j.Promotion_Feedback_Night_Dialog;
        } else if (C9566f.m50203n(this)) {
            i = C8617j.Promotion_Feedback_Night;
            this.f36276F = C8617j.Promotion_Feedback_Night_Dialog;
        } else {
            i = C8617j.Promotion_Feedback_Light;
            this.f36276F = C8617j.Promotion_Feedback_Light_Dialog;
        }
        setTheme(i);
        super.onCreate(bundle);
        setContentView(C8615h.promotion_activity_feedback);
        m49665o2();
        this.f36279z = (AppCompatEditText) findViewById(C8614g.et_input);
        this.f36271A = (AppCompatButton) findViewById(C8614g.btn_submit);
        this.f36272B = (RecyclerView) findViewById(C8614g.rv_image);
        mo478Y1((Toolbar) findViewById(C8614g.toolbar));
        ActionBar R1 = mo471R1();
        if (R1 != null) {
            R1.mo425x(C8616i.coocent_feedback_and_suggestion_hint);
            R1.mo420s(true);
            R1.mo423v(true);
        }
        this.f36272B.setHasFixedSize(true);
        this.f36272B.setLayoutManager(new LinearLayoutManager(this, 0, false));
        this.f36272B.mo4622h(new C9399c(this, getResources().getDimensionPixelOffset(C8612e.feedback_image_decoration)));
        C9409i iVar = new C9409i();
        this.f36273C = iVar;
        this.f36272B.setAdapter(iVar);
        this.f36273C.mo32525k(this.f36278H);
        this.f36279z.addTextChangedListener(this.f36277G);
        this.f36271A.setOnClickListener(this);
        m49666p2();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
