package net.coocent.android.xmlparser.loading;

import android.content.Context;

public enum Z_TYPE {
    DOUBLE_CIRCLE(DoubleCircleBuilder.class),
    TEXT(TextBuilder.class);
    
    private final Class<?> mBuilderClass;

    private Z_TYPE(Class<?> cls) {
        this.mBuilderClass = cls;
    }

    /* access modifiers changed from: package-private */
    public <T extends ZLoadingBuilder> T newInstance(Context context) {
        try {
            return (ZLoadingBuilder) this.mBuilderClass.getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
