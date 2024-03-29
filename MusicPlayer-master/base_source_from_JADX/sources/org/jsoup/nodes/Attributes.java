package org.jsoup.nodes;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class Attributes implements Iterable<Attribute>, Cloneable {
    protected static final String dataPrefix = "data-";
    /* access modifiers changed from: private */
    public LinkedHashMap<String, Attribute> attributes = null;

    private class Dataset extends AbstractMap<String, String> {

        private class DatasetIterator implements Iterator<Map.Entry<String, String>> {
            private Attribute attr;
            private Iterator<Attribute> attrIter;

            private DatasetIterator() {
                this.attrIter = Attributes.this.attributes.values().iterator();
            }

            public boolean hasNext() {
                while (this.attrIter.hasNext()) {
                    Attribute next = this.attrIter.next();
                    this.attr = next;
                    if (next.isDataAttribute()) {
                        return true;
                    }
                }
                return false;
            }

            public void remove() {
                Attributes.this.attributes.remove(this.attr.getKey());
            }

            public Map.Entry<String, String> next() {
                return new Attribute(this.attr.getKey().substring(5), this.attr.getValue());
            }
        }

        private class EntrySet extends AbstractSet<Map.Entry<String, String>> {
            private EntrySet() {
            }

            public Iterator<Map.Entry<String, String>> iterator() {
                return new DatasetIterator();
            }

            public int size() {
                int i = 0;
                while (new DatasetIterator().hasNext()) {
                    i++;
                }
                return i;
            }
        }

        public Set<Map.Entry<String, String>> entrySet() {
            return new EntrySet();
        }

        private Dataset() {
            if (Attributes.this.attributes == null) {
                LinkedHashMap unused = Attributes.this.attributes = new LinkedHashMap(2);
            }
        }

        public String put(String str, String str2) {
            String access$300 = Attributes.dataKey(str);
            String value = Attributes.this.hasKey(access$300) ? ((Attribute) Attributes.this.attributes.get(access$300)).getValue() : null;
            Attributes.this.attributes.put(access$300, new Attribute(access$300, str2));
            return value;
        }
    }

    /* access modifiers changed from: private */
    public static String dataKey(String str) {
        return dataPrefix + str;
    }

    public void addAll(Attributes attributes2) {
        if (attributes2.size() != 0) {
            if (this.attributes == null) {
                this.attributes = new LinkedHashMap<>(attributes2.size());
            }
            this.attributes.putAll(attributes2.attributes);
        }
    }

    public List<Attribute> asList() {
        if (this.attributes == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.attributes.size());
        for (Map.Entry<String, Attribute> value : this.attributes.entrySet()) {
            arrayList.add(value.getValue());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Map<String, String> dataset() {
        return new Dataset();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Attributes)) {
            return false;
        }
        LinkedHashMap<String, Attribute> linkedHashMap = this.attributes;
        LinkedHashMap<String, Attribute> linkedHashMap2 = ((Attributes) obj).attributes;
        if (linkedHashMap != null) {
            if (!linkedHashMap.equals(linkedHashMap2)) {
                return false;
            }
            return true;
        } else if (linkedHashMap2 == null) {
            return true;
        }
        return false;
    }

    public String get(String str) {
        Attribute attribute;
        Validate.notEmpty(str);
        LinkedHashMap<String, Attribute> linkedHashMap = this.attributes;
        if (linkedHashMap == null || (attribute = linkedHashMap.get(str)) == null) {
            return BuildConfig.FLAVOR;
        }
        return attribute.getValue();
    }

    public String getIgnoreCase(String str) {
        Validate.notEmpty(str);
        LinkedHashMap<String, Attribute> linkedHashMap = this.attributes;
        if (linkedHashMap == null) {
            return BuildConfig.FLAVOR;
        }
        for (String next : linkedHashMap.keySet()) {
            if (next.equalsIgnoreCase(str)) {
                return this.attributes.get(next).getValue();
            }
        }
        return BuildConfig.FLAVOR;
    }

    public boolean hasKey(String str) {
        LinkedHashMap<String, Attribute> linkedHashMap = this.attributes;
        return linkedHashMap != null && linkedHashMap.containsKey(str);
    }

    public boolean hasKeyIgnoreCase(String str) {
        LinkedHashMap<String, Attribute> linkedHashMap = this.attributes;
        if (linkedHashMap == null) {
            return false;
        }
        for (String equalsIgnoreCase : linkedHashMap.keySet()) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        LinkedHashMap<String, Attribute> linkedHashMap = this.attributes;
        if (linkedHashMap != null) {
            return linkedHashMap.hashCode();
        }
        return 0;
    }

    public String html() {
        StringBuilder sb = new StringBuilder();
        try {
            html(sb, new Document(BuildConfig.FLAVOR).outputSettings());
            return sb.toString();
        } catch (IOException e) {
            throw new SerializationException((Throwable) e);
        }
    }

    public Iterator<Attribute> iterator() {
        LinkedHashMap<String, Attribute> linkedHashMap = this.attributes;
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            return Collections.emptyList().iterator();
        }
        return this.attributes.values().iterator();
    }

    public void put(String str, String str2) {
        put(new Attribute(str, str2));
    }

    public void remove(String str) {
        Validate.notEmpty(str);
        LinkedHashMap<String, Attribute> linkedHashMap = this.attributes;
        if (linkedHashMap != null) {
            linkedHashMap.remove(str);
        }
    }

    public void removeIgnoreCase(String str) {
        Validate.notEmpty(str);
        LinkedHashMap<String, Attribute> linkedHashMap = this.attributes;
        if (linkedHashMap != null) {
            Iterator<String> it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                if (it.next().equalsIgnoreCase(str)) {
                    it.remove();
                }
            }
        }
    }

    public int size() {
        LinkedHashMap<String, Attribute> linkedHashMap = this.attributes;
        if (linkedHashMap == null) {
            return 0;
        }
        return linkedHashMap.size();
    }

    public String toString() {
        return html();
    }

    public Attributes clone() {
        if (this.attributes == null) {
            return new Attributes();
        }
        try {
            Attributes attributes2 = (Attributes) super.clone();
            attributes2.attributes = new LinkedHashMap<>(this.attributes.size());
            Iterator<Attribute> it = iterator();
            while (it.hasNext()) {
                Attribute next = it.next();
                attributes2.attributes.put(next.getKey(), next.clone());
            }
            return attributes2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void put(String str, boolean z) {
        if (z) {
            put(new BooleanAttribute(str));
        } else {
            remove(str);
        }
    }

    /* access modifiers changed from: package-private */
    public void html(Appendable appendable, Document.OutputSettings outputSettings) throws IOException {
        LinkedHashMap<String, Attribute> linkedHashMap = this.attributes;
        if (linkedHashMap != null) {
            for (Map.Entry<String, Attribute> value : linkedHashMap.entrySet()) {
                appendable.append(" ");
                ((Attribute) value.getValue()).html(appendable, outputSettings);
            }
        }
    }

    public void put(Attribute attribute) {
        Validate.notNull(attribute);
        if (this.attributes == null) {
            this.attributes = new LinkedHashMap<>(2);
        }
        this.attributes.put(attribute.getKey(), attribute);
    }
}
