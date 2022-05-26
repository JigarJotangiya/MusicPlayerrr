package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.C0424a;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.motion.widget.h */
/* compiled from: KeyFrames */
public class C0387h {

    /* renamed from: b */
    static HashMap<String, Constructor<? extends C0382e>> f1783b;

    /* renamed from: a */
    private HashMap<Integer, ArrayList<C0382e>> f1784a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends C0382e>> hashMap = new HashMap<>();
        f1783b = hashMap;
        try {
            hashMap.put("KeyAttribute", C0383f.class.getConstructor(new Class[0]));
            f1783b.put("KeyPosition", C0388i.class.getConstructor(new Class[0]));
            f1783b.put("KeyCycle", C0385g.class.getConstructor(new Class[0]));
            f1783b.put("KeyTimeCycle", C0391k.class.getConstructor(new Class[0]));
            f1783b.put("KeyTrigger", C0393l.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    public C0387h() {
    }

    /* renamed from: a */
    public void mo2555a(C0396n nVar) {
        ArrayList arrayList = this.f1784a.get(-1);
        if (arrayList != null) {
            nVar.mo2584b(arrayList);
        }
    }

    /* renamed from: b */
    public void mo2556b(C0396n nVar) {
        ArrayList arrayList = this.f1784a.get(Integer.valueOf(nVar.f1871c));
        if (arrayList != null) {
            nVar.mo2584b(arrayList);
        }
        ArrayList arrayList2 = this.f1784a.get(-1);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C0382e eVar = (C0382e) it.next();
                if (eVar.mo2545f(((ConstraintLayout.LayoutParams) nVar.f1870b.getLayoutParams()).f2209Z)) {
                    nVar.mo2583a(eVar);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo2557c(C0382e eVar) {
        if (!this.f1784a.containsKey(Integer.valueOf(eVar.f1740b))) {
            this.f1784a.put(Integer.valueOf(eVar.f1740b), new ArrayList());
        }
        ArrayList arrayList = this.f1784a.get(Integer.valueOf(eVar.f1740b));
        if (arrayList != null) {
            arrayList.add(eVar);
        }
    }

    /* renamed from: d */
    public ArrayList<C0382e> mo2558d(int i) {
        return this.f1784a.get(Integer.valueOf(i));
    }

    public C0387h(Context context, XmlPullParser xmlPullParser) {
        HashMap<String, C0424a> hashMap;
        HashMap<String, C0424a> hashMap2;
        C0382e eVar;
        Exception e;
        C0382e eVar2 = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (f1783b.containsKey(name)) {
                        try {
                            Constructor constructor = f1783b.get(name);
                            if (constructor != null) {
                                eVar = (C0382e) constructor.newInstance(new Object[0]);
                                try {
                                    eVar.mo2544e(context, Xml.asAttributeSet(xmlPullParser));
                                    mo2557c(eVar);
                                } catch (Exception e2) {
                                    e = e2;
                                }
                                eVar2 = eVar;
                            } else {
                                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 23);
                                sb.append("Keymaker for ");
                                sb.append(name);
                                sb.append(" not found");
                                throw new NullPointerException(sb.toString());
                            }
                        } catch (Exception e3) {
                            Exception exc = e3;
                            eVar = eVar2;
                            e = exc;
                            Log.e("KeyFrames", "unable to create ", e);
                            eVar2 = eVar;
                            eventType = xmlPullParser.next();
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (!(eVar2 == null || (hashMap2 = eVar2.f1743e) == null)) {
                            C0424a.m2733i(context, xmlPullParser, hashMap2);
                        }
                    } else if (!(!name.equalsIgnoreCase("CustomMethod") || eVar2 == null || (hashMap = eVar2.f1743e) == null)) {
                        C0424a.m2733i(context, xmlPullParser, hashMap);
                    }
                } else if (eventType == 3) {
                    if ("KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }
}
