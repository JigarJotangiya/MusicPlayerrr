package net.coocent.android.xmlparser.loading;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p391j.p392a.p393a.C8614g;
import p391j.p392a.p393a.C8615h;
import p391j.p392a.p393a.C8617j;

public class ZLoadingDialog {
    private boolean mCancelable;
    private boolean mCanceledOnTouchOutside;
    private final WeakReference<Context> mContext;
    private String mHintText;
    private int mHintTextColor;
    private float mHintTextSize;
    private int mLoadingBuilderColor;
    private Z_TYPE mLoadingBuilderType;
    private final int mThemeResId;
    private Dialog mZLoadingDialog;
    /* access modifiers changed from: private */
    public OnDialogDismissListener onDialogDismissListener;

    public ZLoadingDialog(Context context) {
        this(context, C8617j.alert_dialog);
    }

    private View createContentView() {
        if (!isContextNotExist()) {
            return View.inflate((Context) this.mContext.get(), C8615h.z_loading_dialog, (ViewGroup) null);
        }
        throw new RuntimeException("Context is null...");
    }

    private boolean isContextNotExist() {
        return ((Context) this.mContext.get()) == null;
    }

    public void cancel() {
        Dialog dialog = this.mZLoadingDialog;
        if (dialog != null) {
            dialog.cancel();
        }
        this.mZLoadingDialog = null;
    }

    public Dialog create() {
        if (!isContextNotExist()) {
            if (this.mZLoadingDialog != null) {
                cancel();
            }
            this.mZLoadingDialog = new Dialog((Context) this.mContext.get(), this.mThemeResId);
            View createContentView = createContentView();
            ZLoadingView zLoadingView = (ZLoadingView) createContentView.findViewById(C8614g.z_loading_view);
            ZLoadingTextView zLoadingTextView = (ZLoadingTextView) createContentView.findViewById(C8614g.z_text_view);
            TextView textView = (TextView) createContentView.findViewById(C8614g.z_custom_text_view);
            if (this.mHintTextSize > 0.0f && !TextUtils.isEmpty(this.mHintText)) {
                textView.setVisibility(0);
                textView.setText(this.mHintText);
                textView.setTextSize(this.mHintTextSize);
                int i = this.mHintTextColor;
                if (i == -1) {
                    i = this.mLoadingBuilderColor;
                }
                textView.setTextColor(i);
            } else if (!TextUtils.isEmpty(this.mHintText)) {
                zLoadingTextView.setVisibility(0);
                zLoadingTextView.setText(this.mHintText);
                int i2 = this.mHintTextColor;
                if (i2 == -1) {
                    i2 = this.mLoadingBuilderColor;
                }
                zLoadingTextView.setColorFilter(i2);
            }
            zLoadingView.setLoadingBuilder(this.mLoadingBuilderType);
            zLoadingView.setColorFilter(this.mLoadingBuilderColor);
            this.mZLoadingDialog.setContentView(createContentView);
            this.mZLoadingDialog.setCancelable(this.mCancelable);
            this.mZLoadingDialog.setCanceledOnTouchOutside(this.mCanceledOnTouchOutside);
            this.mZLoadingDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                public void onDismiss(DialogInterface dialogInterface) {
                    ZLoadingDialog.this.onDialogDismissListener.onDismiss();
                }
            });
            return this.mZLoadingDialog;
        }
        throw new RuntimeException("Context is null...");
    }

    public void dismiss() {
        Dialog dialog = this.mZLoadingDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.mZLoadingDialog = null;
    }

    public ZLoadingDialog setCancelable(boolean z) {
        this.mCancelable = z;
        return this;
    }

    public ZLoadingDialog setCanceledOnTouchOutside(boolean z) {
        this.mCanceledOnTouchOutside = z;
        return this;
    }

    public void setDialogDismisslistener(OnDialogDismissListener onDialogDismissListener2) {
        this.onDialogDismissListener = onDialogDismissListener2;
    }

    public ZLoadingDialog setHintText(String str) {
        this.mHintText = str;
        return this;
    }

    public ZLoadingDialog setHintTextColor(int i) {
        this.mHintTextColor = i;
        return this;
    }

    public ZLoadingDialog setHintTextSize(float f) {
        this.mHintTextSize = f;
        return this;
    }

    public ZLoadingDialog setLoadingBuilder(Z_TYPE z_type) {
        this.mLoadingBuilderType = z_type;
        return this;
    }

    public ZLoadingDialog setLoadingColor(int i) {
        this.mLoadingBuilderColor = i;
        return this;
    }

    public void show() {
        Dialog dialog = this.mZLoadingDialog;
        if (dialog != null) {
            dialog.show();
        } else {
            create().show();
        }
    }

    public ZLoadingDialog(Context context, int i) {
        this.mHintTextSize = -1.0f;
        this.mHintTextColor = -1;
        this.mCancelable = true;
        this.mCanceledOnTouchOutside = false;
        this.mContext = new WeakReference<>(context);
        this.mThemeResId = i;
    }
}
