package net.coocent.android.xmlparser.loading;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

public class ZLoadingDrawable extends Drawable implements Animatable {
    private final ZLoadingBuilder mZLoadingBuilder;

    public ZLoadingDrawable(ZLoadingBuilder zLoadingBuilder) {
        this.mZLoadingBuilder = zLoadingBuilder;
        zLoadingBuilder.setCallback(new Drawable.Callback() {
            public void invalidateDrawable(Drawable drawable) {
                ZLoadingDrawable.this.invalidateSelf();
            }

            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                ZLoadingDrawable.this.scheduleSelf(runnable, j);
            }

            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                ZLoadingDrawable.this.unscheduleSelf(runnable);
            }
        });
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty()) {
            this.mZLoadingBuilder.draw(canvas);
        }
    }

    public int getIntrinsicHeight() {
        return (int) this.mZLoadingBuilder.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return (int) this.mZLoadingBuilder.getIntrinsicWidth();
    }

    public int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: package-private */
    public void initParams(Context context) {
        ZLoadingBuilder zLoadingBuilder = this.mZLoadingBuilder;
        if (zLoadingBuilder != null) {
            zLoadingBuilder.init(context);
            this.mZLoadingBuilder.initParams(context);
        }
    }

    public boolean isRunning() {
        return this.mZLoadingBuilder.isRunning();
    }

    public void setAlpha(int i) {
        this.mZLoadingBuilder.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mZLoadingBuilder.setColorFilter(colorFilter);
    }

    public void start() {
        this.mZLoadingBuilder.start();
    }

    public void stop() {
        this.mZLoadingBuilder.stop();
    }
}
