package com.coocent.video.videoplayercore.player;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import com.p256kk.taurus.playerbase.p267k.C6698b;
import com.p256kk.taurus.playerbase.p268l.C6700a;
import com.p256kk.taurus.playerbase.p268l.C6701b;

public class WindowHelper {
    private boolean defaultAnimation;
    private boolean firstTouch = true;
    private int floatX;
    private int floatY;
    private boolean isWindowShow;
    /* access modifiers changed from: private */
    public AnimatorSet mCloseAnimatorSet;
    private float mDownX;
    private float mDownY;
    private boolean mDragEnable = true;
    private C6701b mOnWindowListener;
    /* access modifiers changed from: private */
    public AnimatorSet mShowAnimatorSet;
    private View mWindowView;

    /* renamed from: wX */
    private int f8937wX;

    /* renamed from: wY */
    private int f8938wY;

    /* renamed from: wm */
    private WindowManager f8939wm;
    private WindowManager.LayoutParams wmParams;

    public WindowHelper(Context context, View view, C6700a aVar) {
        this.mWindowView = view;
        this.f8939wm = (WindowManager) context.getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.wmParams = layoutParams;
        layoutParams.type = aVar.mo26065f();
        this.wmParams.gravity = aVar.mo26062c();
        this.wmParams.format = aVar.mo26061b();
        this.wmParams.flags = aVar.mo26060a();
        this.wmParams.width = aVar.mo26064e();
        this.wmParams.height = aVar.mo26063d();
        this.wmParams.x = aVar.mo26066g();
        this.wmParams.y = aVar.mo26067h();
        this.defaultAnimation = aVar.mo26068i();
    }

    private boolean addToWindow() {
        if (this.f8939wm != null) {
            if (Build.VERSION.SDK_INT < 19) {
                try {
                    if (this.mWindowView.getParent() == null) {
                        this.f8939wm.addView(this.mWindowView, this.wmParams);
                        this.isWindowShow = true;
                    }
                    return true;
                } catch (Exception unused) {
                }
            } else if (this.mWindowView.isAttachedToWindow()) {
                return false;
            } else {
                this.f8939wm.addView(this.mWindowView, this.wmParams);
                this.isWindowShow = true;
                return true;
            }
        }
        return false;
    }

    private void cancelCloseAnimation() {
        AnimatorSet animatorSet = this.mCloseAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.mCloseAnimatorSet.removeAllListeners();
        }
    }

    private void cancelShowAnimation() {
        AnimatorSet animatorSet = this.mShowAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.mShowAnimatorSet.removeAllListeners();
        }
    }

    private Animator[] getDefaultAnimators(boolean z) {
        float f = 0.0f;
        float f2 = z ? 0.0f : 1.0f;
        if (z) {
            f = 1.0f;
        }
        return new Animator[]{ObjectAnimator.ofFloat(this.mWindowView, "scaleX", new float[]{f2, f}).setDuration(200), ObjectAnimator.ofFloat(this.mWindowView, "scaleY", new float[]{f2, f}).setDuration(200), ObjectAnimator.ofFloat(this.mWindowView, "alpha", new float[]{f2, f}).setDuration(200)};
    }

    /* access modifiers changed from: private */
    public boolean removeFromWindow() {
        C6701b bVar;
        boolean z = true;
        if (this.f8939wm != null) {
            if (Build.VERSION.SDK_INT < 19) {
                try {
                    if (this.mWindowView.getParent() != null) {
                        this.f8939wm.removeViewImmediate(this.mWindowView);
                        this.isWindowShow = false;
                        bVar.onClose();
                        return z;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (this.mWindowView.isAttachedToWindow()) {
                this.f8939wm.removeViewImmediate(this.mWindowView);
                this.isWindowShow = false;
                if (z && (bVar = this.mOnWindowListener) != null) {
                    bVar.onClose();
                }
                return z;
            }
        }
        z = false;
        bVar.onClose();
        return z;
    }

    public void close() {
        close(this.defaultAnimation ? getDefaultAnimators(false) : null);
    }

    public boolean isWindowShow() {
        return this.isWindowShow;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.mDragEnable) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mDownX = motionEvent.getRawX();
            this.mDownY = motionEvent.getRawY();
        } else if (action == 2) {
            if (Math.abs(motionEvent.getRawX() - this.mDownX) > 20.0f || Math.abs(motionEvent.getRawY() - this.mDownY) > 20.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mDragEnable) {
            return false;
        }
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action == 1) {
            this.firstTouch = true;
        } else if (action == 2) {
            if (this.firstTouch) {
                this.floatX = (int) motionEvent.getX();
                this.floatY = (int) (motionEvent.getY() + ((float) C6698b.m38414a(this.mWindowView.getContext())));
                this.firstTouch = false;
            }
            int i = rawX - this.floatX;
            this.f8937wX = i;
            int i2 = rawY - this.floatY;
            this.f8938wY = i2;
            updateWindowViewLayout(i, i2);
        }
        return false;
    }

    public void setDragEnable(boolean z) {
        this.mDragEnable = z;
    }

    public void setOnWindowListener(C6701b bVar) {
        this.mOnWindowListener = bVar;
    }

    public boolean show() {
        return show(this.defaultAnimation ? getDefaultAnimators(true) : null);
    }

    public void updateWindowViewLayout(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.wmParams;
        layoutParams.x = i;
        layoutParams.y = i2;
        this.f8939wm.updateViewLayout(this.mWindowView, layoutParams);
    }

    public void updateWindowViewLayoutSize(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.wmParams;
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f8939wm.updateViewLayout(this.mWindowView, layoutParams);
    }

    public void close(Animator... animatorArr) {
        if (animatorArr == null || animatorArr.length <= 0) {
            removeFromWindow();
            return;
        }
        cancelShowAnimation();
        cancelCloseAnimation();
        AnimatorSet animatorSet = new AnimatorSet();
        this.mCloseAnimatorSet = animatorSet;
        animatorSet.playTogether(animatorArr);
        this.mCloseAnimatorSet.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                WindowHelper.this.mCloseAnimatorSet.removeAllListeners();
                boolean unused = WindowHelper.this.removeFromWindow();
            }
        });
        this.mCloseAnimatorSet.start();
    }

    public boolean show(Animator... animatorArr) {
        if (!addToWindow()) {
            return false;
        }
        ViewParent parent = this.mWindowView.getParent();
        if (parent != null) {
            parent.requestLayout();
        }
        if (animatorArr != null && animatorArr.length > 0) {
            cancelCloseAnimation();
            cancelShowAnimation();
            AnimatorSet animatorSet = new AnimatorSet();
            this.mShowAnimatorSet = animatorSet;
            animatorSet.playTogether(animatorArr);
            this.mShowAnimatorSet.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    WindowHelper.this.mShowAnimatorSet.removeAllListeners();
                }
            });
            this.mShowAnimatorSet.start();
        }
        C6701b bVar = this.mOnWindowListener;
        if (bVar == null) {
            return true;
        }
        bVar.onShow();
        return true;
    }
}
