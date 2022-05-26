package com.coocent.marquee;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.util.Xml;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: com.coocent.marquee.i */
/* compiled from: MarqueeLoader */
public class C2279i {

    /* renamed from: b */
    private static C2279i f7830b;

    /* renamed from: a */
    private final Context f7831a;

    private C2279i(Context context) {
        this.f7831a = context;
    }

    /* renamed from: b */
    public static C2279i m10611b(Context context) {
        if (f7830b == null) {
            synchronized (C2279i.class) {
                if (f7830b == null) {
                    f7830b = new C2279i(context.getApplicationContext());
                }
            }
        }
        return f7830b;
    }

    /* renamed from: c */
    public static void m10612c() {
        f7830b = null;
    }

    /* renamed from: a */
    public ArrayList<C2277g> mo9007a() {
        String str;
        String str2;
        String str3;
        File file = new File(this.f7831a.getFilesDir() + "/marquee.xml");
        ArrayList<C2277g> arrayList = new ArrayList<>();
        if (file.exists()) {
            try {
                Element documentElement = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new FileInputStream(file)).getDocumentElement();
                if (documentElement == null) {
                    return arrayList;
                }
                NodeList elementsByTagName = documentElement.getElementsByTagName("marquee");
                for (int i = 0; i < elementsByTagName.getLength(); i++) {
                    C2277g gVar = new C2277g();
                    Element element = (Element) elementsByTagName.item(i);
                    gVar.mo9006d(((Element) element.getElementsByTagName("name").item(0)).getFirstChild().getNodeValue());
                    gVar.mo9005c(((Element) element.getElementsByTagName("color").item(0)).getFirstChild().getNodeValue());
                    arrayList.add(gVar);
                }
                return arrayList;
            } catch (ParserConfigurationException e) {
                e.printStackTrace();
                return arrayList;
            } catch (IOException e2) {
                e2.printStackTrace();
                return arrayList;
            } catch (SAXException e3) {
                e3.printStackTrace();
                return arrayList;
            } catch (OutOfMemoryError e4) {
                e4.printStackTrace();
                return arrayList;
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            if (C2298o.m10702L0() != null) {
                str = C2298o.m10702L0();
            } else if (C2298o.m10711O0() != 0) {
                str = C2274d.m10591c(C2298o.m10705M0());
            } else if (C2298o.m10721R1() != 0) {
                str = C2274d.m10591c(C2298o.m10721R1());
            } else {
                str = C2276f.f7825a;
            }
            C2277g gVar2 = new C2277g();
            StringBuilder sb = new StringBuilder();
            Resources resources = this.f7831a.getResources();
            int i2 = C2311u.marquee_color;
            sb.append(resources.getString(i2));
            sb.append(" ");
            sb.append(1);
            gVar2.mo9006d(sb.toString());
            gVar2.mo9005c(str);
            arrayList2.add(gVar2);
            if (C2298o.m10708N0() != null) {
                str2 = C2298o.m10708N0();
            } else if (C2298o.m10711O0() != 0) {
                str2 = C2274d.m10591c(C2298o.m10711O0());
            } else {
                str2 = C2276f.f7826b;
            }
            C2277g gVar3 = new C2277g();
            gVar3.mo9006d(this.f7831a.getResources().getString(i2) + " " + 2);
            gVar3.mo9005c(str2);
            arrayList2.add(gVar3);
            if (C2298o.m10714P0() != null) {
                str3 = C2298o.m10714P0();
            } else if (C2298o.m10717Q0() != 0) {
                str3 = C2274d.m10591c(C2298o.m10717Q0());
            } else if (C2298o.m10718Q1() != 0) {
                str3 = C2274d.m10591c(C2298o.m10718Q1());
            } else {
                str3 = C2276f.f7827c;
            }
            C2277g gVar4 = new C2277g();
            gVar4.mo9006d(this.f7831a.getResources().getString(i2) + " " + 3);
            gVar4.mo9005c(str3);
            arrayList2.add(gVar4);
            Log.d("测试--", C2279i.class.getSimpleName() + "#strColor1=#" + str + " strColor2=" + str2 + " strColor3=" + str3);
            mo9008d(arrayList2);
            return mo9007a();
        }
    }

    /* renamed from: d */
    public void mo9008d(ArrayList<C2277g> arrayList) {
        FileOutputStream fileOutputStream;
        File file = new File(this.f7831a.getFilesDir() + "/marquee.xml");
        try {
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            fileOutputStream = null;
        }
        XmlSerializer newSerializer = Xml.newSerializer();
        if (fileOutputStream != null) {
            try {
                newSerializer.setOutput(fileOutputStream, "UTF-8");
            } catch (IOException e3) {
                e3.printStackTrace();
                return;
            }
        }
        newSerializer.startDocument((String) null, Boolean.TRUE);
        newSerializer.startTag((String) null, "marquees");
        for (int i = 0; i < arrayList.size(); i++) {
            newSerializer.startTag((String) null, "marquee");
            newSerializer.startTag((String) null, "name");
            newSerializer.text(arrayList.get(i).mo9004b());
            newSerializer.endTag((String) null, "name");
            newSerializer.startTag((String) null, "color");
            newSerializer.text(arrayList.get(i).mo9003a());
            newSerializer.endTag((String) null, "color");
            newSerializer.endTag((String) null, "marquee");
        }
        newSerializer.endTag((String) null, "marquees");
        newSerializer.endDocument();
        newSerializer.flush();
        if (fileOutputStream != null) {
            fileOutputStream.close();
        }
    }
}
