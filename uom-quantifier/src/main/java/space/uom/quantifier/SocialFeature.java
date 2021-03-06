/*
 * Copyright 2016 Units of Measurement
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package space.uom.quantifier;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum SocialFeature implements Feature {

	@EnabledByDefault
	@Label("GitHub")
	GitHub,

	@Label("Fitbit")
	Fitbit,

	@Label("Google Fit")
	GoogleFit,

	@Label("RunKeeper")
	RunKeeper,

	@Label("Strava")
	Strava,

	@Label("Withings")
	Withings;

	public boolean isActive() {
		return FeatureContext.getFeatureManager().isActive(this);
	}
}