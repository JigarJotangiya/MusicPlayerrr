package p159f.p166c.p224o.p228n.p230c;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.C0133c;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.C0506a;
import androidx.fragment.app.C0602j;
import com.coocent.video.videoplayercore.service.AudioPlayService;
import com.coocent.videoplayer.p061s.C2723c;
import com.coocent.videostore.p067po.Video;
import com.google.android.material.radiobutton.MaterialRadioButton;
import p159f.p166c.p224o.C4620b;
import p159f.p166c.p224o.C4622d;
import p159f.p166c.p224o.C4623e;
import p159f.p166c.p224o.C4627i;
import p159f.p166c.p224o.p225k.C4632d;
import p159f.p166c.p224o.p225k.C4636h;
import p159f.p166c.p224o.p225k.C4638j;
import p159f.p166c.p224o.p226l.C4661k;
import p159f.p166c.p224o.p226l.C4668q;
import p159f.p166c.p224o.p228n.p230c.C4732r;
import p159f.p166c.p224o.p228n.p230c.C4746u;
import p369i.C8446k;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8600r;
import p369i.p387z.p389d.C8602t;

/* renamed from: f.c.o.n.c.s */
/* compiled from: DialogHelper.kt */
public final class C4736s {

    /* renamed from: a */
    public static final C4736s f13541a = new C4736s();

    /* renamed from: f.c.o.n.c.s$a */
    /* compiled from: DialogHelper.kt */
    public static final class C4737a implements C4732r.C4735c {

        /* renamed from: a */
        final /* synthetic */ C4745t<Integer> f13542a;

        C4737a(C4745t<Integer> tVar) {
            this.f13542a = tVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final void m20258b(C4745t tVar, DialogInterface dialogInterface, int i) {
            C8594l.m46771e(tVar, "$listener");
            tVar.mo10036a(Integer.valueOf(i));
            dialogInterface.dismiss();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m20259c(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }

        /* renamed from: a */
        public Dialog mo15457a(Context context) {
            C8594l.m46771e(context, "context");
            C0133c.C0134a aVar = new C0133c.C0134a(context, C4668q.f13454a.mo15398a(context));
            aVar.mo644o(C4627i.coocent_video_delete);
            aVar.mo636g(C4627i.coocent_video_delete_video_msg);
            aVar.mo633d(true);
            aVar.mo641l(17039370, new C4715a(this.f13542a));
            aVar.mo638i(17039360, C4716b.f13512g);
            C0133c a = aVar.mo630a();
            C8594l.m46770d(a, "Builder(context, getDial…               }.create()");
            Window window = a.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(C0506a.m3152d(context, C4622d.video_drawable_dialog_show_tips_round));
            }
            a.show();
            Button e = a.mo624e(-1);
            if (e != null) {
                e.setTextColor(C0506a.m3150b(context, C4620b.videoTextColorPrimaryVariant));
            }
            Button e2 = a.mo624e(-2);
            if (e2 != null) {
                e2.setTextColor(C0506a.m3150b(context, C4620b.videoTextDurationColor));
            }
            return a;
        }
    }

    /* renamed from: f.c.o.n.c.s$b */
    /* compiled from: DialogHelper.kt */
    public static final class C4738b implements C4732r.C4735c {

        /* renamed from: a */
        final /* synthetic */ String f13543a;

        /* renamed from: b */
        final /* synthetic */ String f13544b;

        /* renamed from: c */
        final /* synthetic */ C4745t<Integer> f13545c;

        C4738b(String str, String str2, C4745t<Integer> tVar) {
            this.f13543a = str;
            this.f13544b = str2;
            this.f13545c = tVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final void m20263b(C4745t tVar, DialogInterface dialogInterface, int i) {
            C8594l.m46771e(tVar, "$listener");
            dialogInterface.dismiss();
            tVar.mo10036a(17039370);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m20264c(C4745t tVar, DialogInterface dialogInterface, int i) {
            C8594l.m46771e(tVar, "$listener");
            dialogInterface.dismiss();
            tVar.mo10036a(17039360);
        }

        /* renamed from: a */
        public Dialog mo15457a(Context context) {
            C8594l.m46771e(context, "context");
            C4632d d = C4632d.m20097d(LayoutInflater.from(context), (ViewGroup) null, false);
            C8594l.m46770d(d, "inflate(\n               …lse\n                    )");
            d.f13370d.setText(this.f13543a);
            if (this.f13544b == null) {
                d.f13369c.setVisibility(0);
                d.f13369c.setBackground(C0506a.m3152d(context, C4622d.ic_tips));
            } else {
                d.f13368b.setVisibility(0);
                d.f13368b.setBackground(C0506a.m3152d(context, C4622d.ic_tips));
            }
            C0133c.C0134a aVar = new C0133c.C0134a(context, C4668q.f13454a.mo15398a(context));
            aVar.mo646q(d.mo7577a());
            aVar.mo633d(true);
            aVar.mo641l(17039370, new C4717c(this.f13545c));
            aVar.mo638i(17039360, new C4718d(this.f13545c));
            C0133c a = aVar.mo630a();
            C8594l.m46770d(a, "Builder(context, getDial…                .create()");
            String str = this.f13544b;
            if (str != null) {
                a.setTitle(str);
            }
            C4736s.f13541a.mo15458a(context, a);
            return a;
        }
    }

    /* renamed from: f.c.o.n.c.s$c */
    /* compiled from: DialogHelper.kt */
    public static final class C4739c implements C4732r.C4735c {

        /* renamed from: a */
        final /* synthetic */ C4745t<Integer> f13546a;

        C4739c(C4745t<Integer> tVar) {
            this.f13546a = tVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final void m20268b(C4745t tVar, DialogInterface dialogInterface, int i) {
            C8594l.m46771e(tVar, "$listener");
            tVar.mo10036a(1);
            dialogInterface.dismiss();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m20269c(C4745t tVar, DialogInterface dialogInterface, int i) {
            C8594l.m46771e(tVar, "$listener");
            tVar.mo10036a(0);
            dialogInterface.dismiss();
        }

        /* renamed from: a */
        public Dialog mo15457a(Context context) {
            C8594l.m46771e(context, "context");
            C4632d d = C4632d.m20097d(LayoutInflater.from(context), (ViewGroup) null, false);
            C8594l.m46770d(d, "inflate(\n               …  false\n                )");
            d.f13370d.setText(context.getString(C4627i.video_the_video_will_be_moved_to_a_private_folder));
            C0133c.C0134a aVar = new C0133c.C0134a(context, C4668q.f13454a.mo15398a(context));
            aVar.mo646q(d.mo7577a());
            aVar.mo644o(C4627i.video_encrypted_video);
            aVar.mo633d(true);
            aVar.mo641l(17039370, new C4720f(this.f13546a));
            aVar.mo638i(17039360, new C4719e(this.f13546a));
            C0133c a = aVar.mo630a();
            C8594l.m46770d(a, "Builder(context, getDial…               }.create()");
            C4736s.f13541a.mo15458a(context, a);
            return a;
        }
    }

    /* renamed from: f.c.o.n.c.s$d */
    /* compiled from: DialogHelper.kt */
    public static final class C4740d implements C4732r.C4735c {

        /* renamed from: a */
        final /* synthetic */ Video f13547a;

        C4740d(Video video) {
            this.f13547a = video;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final void m20273b(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x010f  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0123  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0134  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0089  */
        @android.annotation.SuppressLint({"SetTextI18n"})
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.app.Dialog mo15457a(android.content.Context r12) {
            /*
                r11 = this;
                java.lang.String r0 = "context"
                p369i.p387z.p389d.C8594l.m46771e(r12, r0)
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r12)
                r1 = 0
                r2 = 0
                f.c.o.k.e r0 = p159f.p166c.p224o.p225k.C4633e.m20101d(r0, r1, r2)
                java.lang.String r1 = "inflate(LayoutInflater.from(context), null, false)"
                p369i.p387z.p389d.C8594l.m46770d(r0, r1)
                com.coocent.videostore.po.Video r1 = r11.f13547a
                androidx.appcompat.widget.AppCompatTextView r3 = r0.f13376f
                java.lang.String r4 = r1.mo10565w()
                r3.setText(r4)
                androidx.appcompat.widget.AppCompatTextView r3 = r0.f13375e
                java.lang.Boolean r4 = r1.mo10554m()
                if (r4 == 0) goto L_0x003d
                java.lang.Boolean r4 = r1.mo10554m()
                java.lang.String r5 = "video.isPrivateVideo"
                p369i.p387z.p389d.C8594l.m46770d(r4, r5)
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L_0x003d
                int r4 = p159f.p166c.p224o.C4627i.video_encrypted
                java.lang.String r4 = r12.getString(r4)
                goto L_0x0041
            L_0x003d:
                java.lang.String r4 = r1.mo10551j()
            L_0x0041:
                r3.setText(r4)
                androidx.appcompat.widget.AppCompatTextView r3 = r0.f13378h
                i.z.d.w r4 = p369i.p387z.p389d.C8605w.f34938a
                java.util.Locale r4 = java.util.Locale.US
                r5 = 1
                java.lang.Object[] r6 = new java.lang.Object[r5]
                long r7 = r1.mo10563u()
                float r7 = (float) r7
                r8 = 1149239296(0x44800000, float:1024.0)
                float r7 = r7 / r8
                float r7 = r7 / r8
                java.lang.Float r7 = java.lang.Float.valueOf(r7)
                r6[r2] = r7
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r6, r5)
                java.lang.String r6 = "%.1f MB"
                java.lang.String r2 = java.lang.String.format(r4, r6, r2)
                java.lang.String r6 = "java.lang.String.format(locale, format, *args)"
                p369i.p387z.p389d.C8594l.m46770d(r2, r6)
                r3.setText(r2)
                androidx.appcompat.widget.AppCompatTextView r2 = r0.f13374d
                java.lang.String r3 = r1.mo10548h()
                r2.setText(r3)
                androidx.appcompat.widget.AppCompatTextView r2 = r0.f13373c
                java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
                long r6 = r1.mo10547g()
                r8 = 3600000(0x36ee80, double:1.7786363E-317)
                int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r10 < 0) goto L_0x0089
                java.lang.String r6 = "HH:mm:ss"
                goto L_0x008b
            L_0x0089:
                java.lang.String r6 = "mm:ss"
            L_0x008b:
                r3.<init>(r6, r4)
                java.util.Date r6 = new java.util.Date
                long r7 = r1.mo10547g()
                r6.<init>(r7)
                java.lang.String r3 = r3.format(r6)
                r2.setText(r3)
                androidx.appcompat.widget.AppCompatTextView r2 = r0.f13377g
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                int r6 = r1.mo10568y()
                r3.append(r6)
                java.lang.String r6 = " x "
                r3.append(r6)
                int r6 = r1.mo10552k()
                r3.append(r6)
                java.lang.String r3 = r3.toString()
                r2.setText(r3)
                androidx.appcompat.widget.AppCompatTextView r2 = r0.f13372b
                java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
                java.lang.String r6 = "yyyy-MM-dd HH:mm:ss"
                r3.<init>(r6, r4)
                java.util.Date r4 = new java.util.Date
                long r6 = r1.mo10542d()
                r1 = 1000(0x3e8, float:1.401E-42)
                long r8 = (long) r1
                long r6 = r6 * r8
                r4.<init>(r6)
                java.lang.String r1 = r3.format(r4)
                r2.setText(r1)
                androidx.appcompat.app.c$a r1 = new androidx.appcompat.app.c$a
                f.c.o.l.q$a r2 = p159f.p166c.p224o.p226l.C4668q.f13454a
                int r2 = r2.mo15398a(r12)
                r1.<init>(r12, r2)
                android.widget.LinearLayout r0 = r0.mo7577a()
                r1.mo646q(r0)
                int r0 = p159f.p166c.p224o.C4627i.coocent_information
                r1.mo644o(r0)
                r1.mo633d(r5)
                r0 = 17039370(0x104000a, float:2.42446E-38)
                f.c.o.n.c.g r2 = p159f.p166c.p224o.p228n.p230c.C4721g.f13517g
                r1.mo641l(r0, r2)
                androidx.appcompat.app.c r0 = r1.mo630a()
                java.lang.String r1 = "Builder(context, getDial…               }.create()"
                p369i.p387z.p389d.C8594l.m46770d(r0, r1)
                android.view.Window r1 = r0.getWindow()
                if (r1 != 0) goto L_0x010f
                goto L_0x0118
            L_0x010f:
                int r2 = p159f.p166c.p224o.C4622d.video_drawable_dialog_show_tips_round
                android.graphics.drawable.Drawable r2 = androidx.core.content.C0506a.m3152d(r12, r2)
                r1.setBackgroundDrawable(r2)
            L_0x0118:
                r0.show()
                r1 = -1
                android.widget.Button r1 = r0.mo624e(r1)
                if (r1 != 0) goto L_0x0123
                goto L_0x012c
            L_0x0123:
                int r2 = p159f.p166c.p224o.C4620b.videoTextColorPrimaryVariant
                int r2 = androidx.core.content.C0506a.m3150b(r12, r2)
                r1.setTextColor(r2)
            L_0x012c:
                r1 = -2
                android.widget.Button r1 = r0.mo624e(r1)
                if (r1 != 0) goto L_0x0134
                goto L_0x013d
            L_0x0134:
                int r2 = p159f.p166c.p224o.C4620b.videoTextDurationColor
                int r12 = androidx.core.content.C0506a.m3150b(r12, r2)
                r1.setTextColor(r12)
            L_0x013d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p224o.p228n.p230c.C4736s.C4740d.mo15457a(android.content.Context):android.app.Dialog");
        }
    }

    /* renamed from: f.c.o.n.c.s$e */
    /* compiled from: DialogHelper.kt */
    public static final class C4741e implements C4732r.C4735c {

        /* renamed from: a */
        final /* synthetic */ Video f13548a;

        /* renamed from: b */
        final /* synthetic */ C4745t<String> f13549b;

        C4741e(Video video, C4745t<String> tVar) {
            this.f13548a = video;
            this.f13549b = tVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final void m20276b(Context context, C4636h hVar) {
            C8594l.m46771e(context, "$context");
            C8594l.m46771e(hVar, "$binding");
            C4661k kVar = C4661k.f13447a;
            AppCompatEditText appCompatEditText = hVar.f13385b;
            C8594l.m46770d(appCompatEditText, "binding.etRename");
            kVar.mo15393b(context, appCompatEditText);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m20277c(C4636h hVar, Video video, C4745t tVar, Context context, DialogInterface dialogInterface, int i) {
            String obj;
            C8594l.m46771e(hVar, "$binding");
            C8594l.m46771e(video, "$video");
            C8594l.m46771e(tVar, "$listener");
            C8594l.m46771e(context, "$context");
            Editable text = hVar.f13385b.getText();
            String str = null;
            if (!(text == null || (obj = text.toString()) == null)) {
                str = C8437p.m46563l0(obj).toString();
            }
            if (TextUtils.isEmpty(str)) {
                Toast.makeText(context, C4627i.coocent_video_rename_failed, 0).show();
            } else if (!TextUtils.equals(str, video.mo10565w())) {
                C8594l.m46769c(str);
                tVar.mo10036a(str);
            }
            C4661k.f13447a.mo15392a(context, hVar.f13385b);
            dialogInterface.dismiss();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m20278d(Context context, C4636h hVar, DialogInterface dialogInterface, int i) {
            C8594l.m46771e(context, "$context");
            C8594l.m46771e(hVar, "$binding");
            C4661k.f13447a.mo15392a(context, hVar.f13385b);
            dialogInterface.dismiss();
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final boolean m20279e(Context context, C0133c cVar, View view, MotionEvent motionEvent) {
            C8594l.m46771e(context, "$context");
            C8594l.m46771e(cVar, "$alertDialog");
            if (motionEvent != null && motionEvent.getAction() == 0) {
                C4661k kVar = C4661k.f13447a;
                Window window = cVar.getWindow();
                kVar.mo15392a(context, window == null ? null : window.getDecorView());
            }
            return false;
        }

        /* renamed from: a */
        public Dialog mo15457a(Context context) {
            View decorView;
            C8594l.m46771e(context, "context");
            C4636h d = C4636h.m20112d(LayoutInflater.from(context), (ViewGroup) null, false);
            C8594l.m46770d(d, "inflate(\n               …  false\n                )");
            Video video = this.f13548a;
            d.f13385b.requestFocus();
            d.f13385b.setText(video.mo10565w());
            d.f13385b.selectAll();
            d.f13385b.getCustomSelectionActionModeCallback();
            d.f13385b.postDelayed(new C4723i(context, d), 150);
            C0133c.C0134a aVar = new C0133c.C0134a(context, C4668q.f13454a.mo15398a(context));
            aVar.mo646q(d.mo7577a());
            aVar.mo644o(C4627i.coocent_video_rename);
            aVar.mo633d(true);
            aVar.mo641l(17039370, new C4725k(d, this.f13548a, this.f13549b, context));
            aVar.mo638i(17039360, new C4722h(context, d));
            C0133c a = aVar.mo630a();
            C8594l.m46770d(a, "Builder(context, getDial…               }.create()");
            Window window = a.getWindow();
            if (!(window == null || (decorView = window.getDecorView()) == null)) {
                decorView.setOnTouchListener(new C4724j(context, a));
            }
            Window window2 = a.getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawable(C0506a.m3152d(context, C4622d.video_drawable_dialog_show_tips_round));
            }
            a.show();
            Button e = a.mo624e(-1);
            if (e != null) {
                e.setTextColor(C0506a.m3150b(context, C4620b.videoTextColorPrimaryVariant));
            }
            Button e2 = a.mo624e(-2);
            if (e2 != null) {
                e2.setTextColor(C0506a.m3150b(context, C4620b.videoTextDurationColor));
            }
            return a;
        }
    }

    /* renamed from: f.c.o.n.c.s$f */
    /* compiled from: DialogHelper.kt */
    public static final class C4742f implements C4746u.C4748b {

        /* renamed from: a */
        final /* synthetic */ C4745t<String> f13550a;

        C4742f(C4745t<String> tVar) {
            this.f13550a = tVar;
        }

        /* renamed from: a */
        public void mo15467a(String str) {
            this.f13550a.mo10036a(str);
        }
    }

    /* renamed from: f.c.o.n.c.s$g */
    /* compiled from: DialogHelper.kt */
    public static final class C4743g implements C4732r.C4735c {

        /* renamed from: a */
        final /* synthetic */ C4745t<Integer> f13551a;

        C4743g(C4745t<Integer> tVar) {
            this.f13551a = tVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final void m20286b(C4745t tVar, DialogInterface dialogInterface, int i) {
            C8594l.m46771e(tVar, "$listener");
            dialogInterface.dismiss();
            tVar.mo10036a(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m20287c(C4745t tVar, DialogInterface dialogInterface, int i) {
            C8594l.m46771e(tVar, "$listener");
            dialogInterface.dismiss();
            tVar.mo10036a(0);
        }

        /* renamed from: a */
        public Dialog mo15457a(Context context) {
            C8594l.m46771e(context, "context");
            C0133c.C0134a aVar = new C0133c.C0134a(context, C4668q.f13454a.mo15398a(context));
            aVar.mo645p(context.getString(C4627i.video_permission_dialog_title));
            aVar.mo637h(context.getString(C4627i.video_permission_dialog_message));
            aVar.mo633d(true);
            aVar.mo641l(17039370, new C4727m(this.f13551a));
            aVar.mo638i(17039360, new C4726l(this.f13551a));
            C0133c a = aVar.mo630a();
            C8594l.m46770d(a, "Builder(context, getDial…                .create()");
            C4736s.f13541a.mo15458a(context, a);
            return a;
        }
    }

    /* renamed from: f.c.o.n.c.s$h */
    /* compiled from: DialogHelper.kt */
    public static final class C4744h implements C4732r.C4735c {

        /* renamed from: a */
        final /* synthetic */ int f13552a;

        /* renamed from: b */
        final /* synthetic */ String f13553b;

        /* renamed from: c */
        final /* synthetic */ boolean f13554c;

        /* renamed from: d */
        final /* synthetic */ C4745t<C8446k<String, Boolean>> f13555d;

        C4744h(int i, String str, boolean z, C4745t<C8446k<String, Boolean>> tVar) {
            this.f13552a = i;
            this.f13553b = str;
            this.f13554c = z;
            this.f13555d = tVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final void m20291b(C8602t tVar, int i, C8600r rVar, RadioGroup radioGroup, int i2) {
            C8594l.m46771e(tVar, "$sortOrder");
            C8594l.m46771e(rVar, "$asc");
            if (i2 == C4623e.rb_name) {
                tVar.element = i == 1 ? "folder_name" : "display_name";
            } else if (i2 == C4623e.rb_date) {
                tVar.element = "date_modified";
            } else if (i2 == C4623e.rb_size) {
                tVar.element = "size";
            } else if (i2 == C4623e.rb_duration) {
                tVar.element = "duration";
            } else if (i2 == C4623e.rb_quantity) {
                tVar.element = "video_count";
            } else if (i2 == C4623e.rb_asc) {
                rVar.element = true;
            } else if (i2 == C4623e.rb_desc) {
                rVar.element = false;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m20292c(C4745t tVar, C8602t tVar2, C8600r rVar, DialogInterface dialogInterface, int i) {
            C8594l.m46771e(tVar2, "$sortOrder");
            C8594l.m46771e(rVar, "$asc");
            if (tVar != null) {
                tVar.mo10036a(new C8446k(tVar2.element, Boolean.valueOf(rVar.element)));
            }
            dialogInterface.dismiss();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m20293d(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }

        /* renamed from: a */
        public Dialog mo15457a(Context context) {
            C8594l.m46771e(context, "context");
            C4638j d = C4638j.m20120d(LayoutInflater.from(context), (ViewGroup) null, false);
            C8594l.m46770d(d, "inflate(LayoutInflater.from(context), null, false)");
            if (this.f13552a == 1) {
                MaterialRadioButton materialRadioButton = d.f13393d;
                C8594l.m46770d(materialRadioButton, "binding.rbSize");
                materialRadioButton.setVisibility(8);
                MaterialRadioButton materialRadioButton2 = d.f13391b;
                C8594l.m46770d(materialRadioButton2, "binding.rbDuration");
                materialRadioButton2.setVisibility(8);
                if (TextUtils.equals(this.f13553b, "folder_name")) {
                    d.f13395f.check(C4623e.rb_name);
                } else if (TextUtils.equals(this.f13553b, "video_count")) {
                    d.f13395f.check(C4623e.rb_quantity);
                } else {
                    d.f13395f.check(C4623e.rb_date);
                }
            } else {
                MaterialRadioButton materialRadioButton3 = d.f13392c;
                C8594l.m46770d(materialRadioButton3, "binding.rbQuantity");
                materialRadioButton3.setVisibility(8);
                if (TextUtils.equals(this.f13553b, "display_name")) {
                    d.f13395f.check(C4623e.rb_name);
                } else if (TextUtils.equals(this.f13553b, "size")) {
                    d.f13395f.check(C4623e.rb_size);
                } else if (TextUtils.equals(this.f13553b, "duration")) {
                    d.f13395f.check(C4623e.rb_duration);
                } else {
                    d.f13395f.check(C4623e.rb_date);
                }
            }
            d.f13394e.check(this.f13554c ? C4623e.rb_asc : C4623e.rb_desc);
            C8602t tVar = new C8602t();
            tVar.element = this.f13553b;
            C8600r rVar = new C8600r();
            rVar.element = this.f13554c;
            C4730p pVar = new C4730p(tVar, this.f13552a, rVar);
            d.f13395f.setOnCheckedChangeListener(pVar);
            d.f13394e.setOnCheckedChangeListener(pVar);
            C0133c.C0134a aVar = new C0133c.C0134a(context, C4668q.f13454a.mo15398a(context));
            aVar.mo646q(d.mo7577a());
            aVar.mo644o(C4627i.coocent_video_sort_by);
            aVar.mo633d(true);
            aVar.mo641l(17039370, new C4729o(this.f13555d, tVar, rVar));
            aVar.mo638i(17039360, C4728n.f13530g);
            C0133c a = aVar.mo630a();
            C8594l.m46770d(a, "Builder(\n               …                .create()");
            Window window = a.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(C0506a.m3152d(context, C4622d.video_drawable_dialog_show_tips_round));
            }
            a.show();
            Button e = a.mo624e(-1);
            if (e != null) {
                e.setTextColor(C0506a.m3150b(context, C4620b.videoTextColorPrimaryVariant));
            }
            Button e2 = a.mo624e(-2);
            if (e2 != null) {
                e2.setTextColor(C0506a.m3150b(context, C4620b.videoTextDurationColor));
            }
            return a;
        }
    }

    private C4736s() {
    }

    /* renamed from: a */
    public final void mo15458a(Context context, C0133c cVar) {
        C8594l.m46771e(context, "context");
        if (cVar != null) {
            Window window = cVar.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new BitmapDrawable());
            }
            Window window2 = cVar.getWindow();
            WindowManager.LayoutParams attributes = window2 == null ? null : window2.getAttributes();
            if (attributes != null) {
                attributes.width = C2723c.m12315b(context) - 300;
            }
            Window window3 = cVar.getWindow();
            if (window3 != null) {
                window3.setAttributes(attributes);
            }
            Drawable d = C0506a.m3152d(context, C4622d.video_drawable_dialog_show_tips_round);
            Window window4 = cVar.getWindow();
            if (window4 != null) {
                window4.setBackgroundDrawable(d);
            }
            cVar.show();
            Button e = cVar.mo624e(-1);
            if (e != null) {
                e.setTextColor(C0506a.m3150b(context, C4620b.videoTextColorPrimaryVariant));
            }
            Button e2 = cVar.mo624e(-2);
            if (e2 != null) {
                e2.setTextColor(C0506a.m3150b(context, C4620b.videoTextDurationColor));
            }
        }
    }

    /* renamed from: b */
    public final void mo15459b(C0602j jVar, C4745t<Integer> tVar) {
        C8594l.m46771e(jVar, "fragmentManager");
        C8594l.m46771e(tVar, "listener");
        C4732r.C4733a.m20245b(C4732r.f13538s0, new C4737a(tVar), (C4732r.C4734b) null, true, 2, (Object) null).mo3841h3(jVar, "delete");
    }

    /* renamed from: c */
    public final void mo15460c(String str, String str2, C0602j jVar, C4745t<Integer> tVar) {
        C8594l.m46771e(str2, "message");
        C8594l.m46771e(jVar, "fragmentManager");
        C8594l.m46771e(tVar, "listener");
        C4732r.C4733a.m20245b(C4732r.f13538s0, new C4738b(str2, str, tVar), (C4732r.C4734b) null, false, 2, (Object) null).mo3841h3(jVar, "showEncryptFirstTipsDialog");
    }

    /* renamed from: d */
    public final void mo15461d(C0602j jVar, C4745t<Integer> tVar) {
        C8594l.m46771e(jVar, "fragmentManager");
        C8594l.m46771e(tVar, "listener");
        C4732r.C4733a.m20245b(C4732r.f13538s0, new C4739c(tVar), (C4732r.C4734b) null, true, 2, (Object) null).mo3841h3(jVar, "encrypted");
    }

    /* renamed from: e */
    public final void mo15462e(C0602j jVar, Video video) {
        C8594l.m46771e(jVar, "fragmentManager");
        C8594l.m46771e(video, "video");
        C4732r.C4733a.m20245b(C4732r.f13538s0, new C4740d(video), (C4732r.C4734b) null, true, 2, (Object) null).mo3841h3(jVar, "info");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: f */
    public final void mo15463f(C0602j jVar, Video video, C4745t<String> tVar) {
        C8594l.m46771e(jVar, "fragmentManager");
        C8594l.m46771e(video, "video");
        C8594l.m46771e(tVar, "listener");
        C4732r.C4733a.m20245b(C4732r.f13538s0, new C4741e(video, tVar), (C4732r.C4734b) null, true, 2, (Object) null).mo3841h3(jVar, AudioPlayService.KEY_RENAME);
    }

    /* renamed from: g */
    public final void mo15464g(C0602j jVar, C4745t<String> tVar) {
        C8594l.m46771e(jVar, "fragmentManager");
        C8594l.m46771e(tVar, "listener");
        C4746u uVar = new C4746u();
        uVar.mo15468n3(new C4742f(tVar));
        uVar.mo3841h3(jVar, C4746u.f13556t0.mo15472a());
    }

    /* renamed from: h */
    public final void mo15465h(C0602j jVar, C4745t<Integer> tVar) {
        C8594l.m46771e(jVar, "fragmentManager");
        C8594l.m46771e(tVar, "listener");
        C4732r.C4733a.m20245b(C4732r.f13538s0, new C4743g(tVar), (C4732r.C4734b) null, false, 2, (Object) null).mo3841h3(jVar, "showSettingRequestPermissionDialog");
    }

    /* renamed from: i */
    public final void mo15466i(C0602j jVar, int i, String str, boolean z, C4745t<C8446k<String, Boolean>> tVar) {
        C8594l.m46771e(jVar, "fragmentManager");
        C8594l.m46771e(str, "sort");
        C4732r.C4733a.m20245b(C4732r.f13538s0, new C4744h(i, str, z, tVar), (C4732r.C4734b) null, true, 2, (Object) null).mo3841h3(jVar, String.valueOf(i));
    }
}
