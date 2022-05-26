package net.coocent.android.xmlparser.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.C0133c;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.play.core.appupdate.C6288b;
import net.coocent.android.xmlparser.loading.ZLoadingDialog;
import net.coocent.android.xmlparser.loading.Z_TYPE;
import net.coocent.android.xmlparser.p460y.C9560a;
import net.coocent.android.xmlparser.p461z.C9564d;
import net.coocent.android.xmlparser.update.UpdateResult;
import net.coocent.android.xmlparser.widget.dialog.CommonDialog;
import p391j.p392a.p393a.C8614g;
import p391j.p392a.p393a.C8615h;
import p391j.p392a.p393a.C8616i;
import p391j.p392a.p393a.C8617j;

public class DialogHelper {
    /* renamed from: a */
    public static CommonDialog m50000a(Context context, C9560a aVar, int i, C9535l<Integer> lVar) {
        int i2;
        Resources resources = context.getResources();
        int i3 = resources.getConfiguration().orientation;
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (i3 == 1) {
            i2 = displayMetrics.widthPixels;
        } else {
            i2 = displayMetrics.heightPixels;
        }
        CommonDialog.C9517b bVar = new CommonDialog.C9517b(C8617j.Promotion_Dialog_FullScreen);
        bVar.mo32779g(false);
        bVar.mo32778f(true);
        bVar.mo32784l(17);
        bVar.mo32783k(0.5f);
        bVar.mo32787o(i2);
        bVar.mo32785m(-2);
        bVar.mo32786n(C8615h.layout_dialog_rewarded_video);
        bVar.mo32782j(new CommonDialog.DialogViewBinder(aVar, resources, i, lVar) {

            /* renamed from: g */
            final /* synthetic */ C9560a f36548g;

            /* renamed from: h */
            final /* synthetic */ Resources f36549h;

            /* renamed from: i */
            final /* synthetic */ int f36550i;

            /* renamed from: j */
            final /* synthetic */ C9535l f36551j;

            {
                this.f36549h = r2;
                this.f36550i = r3;
                this.f36551j = r4;
            }

            /* renamed from: b */
            static /* synthetic */ void m50010b(CommonDialog commonDialog, C9535l lVar, View view) {
                if (view.getId() == C8614g.iv_close) {
                    commonDialog.mo3832Y2();
                } else if (lVar != null) {
                    lVar.mo32484a(Integer.valueOf(view.getId()));
                    commonDialog.mo3832Y2();
                }
            }

            /* renamed from: a */
            public void mo32770a(CommonDialog commonDialog, View view) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C8614g.iv_close);
                AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(C8614g.tv_title);
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(C8614g.tv_description);
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) view.findViewById(C8614g.tv_coins_enough);
                AppCompatTextView appCompatTextView4 = (AppCompatTextView) view.findViewById(C8614g.tv_get_coins);
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(C8614g.iv_coins_enough);
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) view.findViewById(C8614g.iv_get_coins);
                LinearLayout linearLayout = (LinearLayout) view.findViewById(C8614g.layout_coins_enough);
                LinearLayout linearLayout2 = (LinearLayout) view.findViewById(C8614g.layout_get_coins);
                boolean z = true;
                boolean z2 = this.f36548g != null;
                StringBuilder sb = new StringBuilder();
                appCompatTextView.setText(this.f36549h.getString(C8616i.my_coins) + " : " + this.f36550i);
                if (!z2) {
                    sb.append(this.f36549h.getString(C8616i.remove_ads_tip1));
                    sb.append("\n\n");
                    sb.append(this.f36549h.getString(C8616i.remove_ads_tip2));
                    sb.append("\n\n");
                    sb.append(this.f36549h.getString(C8616i.remove_ads_tip3));
                    appCompatTextView2.setText(sb.toString());
                    C9560a aVar = this.f36548g;
                    if (aVar == null) {
                        if (this.f36550i < 50) {
                            z = false;
                        }
                        linearLayout.setEnabled(z);
                        C9520a aVar2 = new C9520a(commonDialog, this.f36551j);
                        appCompatImageView.setOnClickListener(aVar2);
                        linearLayout.setOnClickListener(aVar2);
                        linearLayout2.setOnClickListener(aVar2);
                        return;
                    }
                    aVar.mo32947b();
                    throw null;
                }
                this.f36548g.mo32948c();
                throw null;
            }
        });
        return bVar.mo32777e();
    }

    /* renamed from: b */
    public static CommonDialog m50001b(CommonDialog.DialogCancelCallback dialogCancelCallback) {
        CommonDialog.C9517b bVar = new CommonDialog.C9517b();
        bVar.mo32778f(true);
        bVar.mo32779g(false);
        bVar.mo32783k(0.5f);
        bVar.mo32781i(dialogCancelCallback);
        bVar.mo32780h(new CommonDialog.CreateDialogCallback() {
            /* renamed from: a */
            public Dialog mo32751a(Context context) {
                return new ZLoadingDialog(context).setLoadingBuilder(Z_TYPE.values()[0]).setLoadingColor(-16777216).setHintText(context.getString(C8616i.coocent_loading)).setHintTextSize(16.0f).setHintTextColor(-7829368).create();
            }
        });
        return bVar.mo32777e();
    }

    /* renamed from: c */
    public static C0133c m50002c(Context context, UpdateResult updateResult) {
        C0133c.C0134a aVar = new C0133c.C0134a(context);
        aVar.mo633d(TextUtils.isEmpty(updateResult.getNewPackageName()));
        aVar.mo644o(C8616i.promotion_tips);
        aVar.mo637h(updateResult.getMessage());
        aVar.mo641l(17039370, C9526g.f36563g);
        C0133c a = aVar.mo630a();
        a.setOnShowListener(new C9525f(a, updateResult, context));
        return a;
    }

    /* renamed from: d */
    public static C0133c m50003d(Context context, C6288b bVar) {
        View inflate = LayoutInflater.from(context).inflate(C8615h.layout_dialog_update, (ViewGroup) null, false);
        C0133c.C0134a aVar = new C0133c.C0134a(context, C8617j.Promotion_Dialog_RestartUpdate);
        aVar.mo646q(inflate);
        aVar.mo633d(true);
        aVar.mo641l(C8616i.restart, new C9522c(bVar));
        C0133c a = aVar.mo630a();
        a.setOnShowListener(new C9521b(a));
        inflate.findViewById(C8614g.iv_close).setOnClickListener(new C9524e(a));
        return a;
    }

    /* renamed from: e */
    static /* synthetic */ void m50004e(DialogInterface dialogInterface, int i) {
    }

    /* renamed from: f */
    static /* synthetic */ void m50005f(UpdateResult updateResult, Context context, C0133c cVar, View view) {
        if (!TextUtils.isEmpty(updateResult.getNewPackageName())) {
            C9564d.m50181g(context, updateResult.getNewPackageName());
        } else {
            cVar.dismiss();
        }
    }

    /* renamed from: h */
    static /* synthetic */ void m50007h(C6288b bVar, DialogInterface dialogInterface, int i) {
        bVar.mo25155a();
        dialogInterface.dismiss();
    }
}
