package com.envision.eeop.internal.event;

import java.io.IOException;
import java.io.Serializable;

public interface Element extends Serializable {

	public void accept(EventVisitor visitor) throws IOException;
}
