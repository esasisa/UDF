
public final class UpperCase extends UDF{
            public Text evaluate(final Text s) {
                  if (s == null) { return null; }
                  return new Text(s.toString().toUpperCase());
               }
        }
