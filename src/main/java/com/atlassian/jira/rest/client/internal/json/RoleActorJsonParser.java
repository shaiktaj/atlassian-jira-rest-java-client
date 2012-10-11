/*
 * Copyright (C) 2012 Atlassian
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.atlassian.jira.rest.client.internal.json;

import com.atlassian.jira.rest.client.domain.RoleActor;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;


public class RoleActorJsonParser implements JsonObjectParser<RoleActor> {

	@Override
	public RoleActor parse(final JSONObject json) throws JSONException {
		final String displayName = json.getString("displayName");
		final String type = json.getString("type");
		final String name = json.getString("name");
		final String avatarUrl = JsonParseUtil.getOptionalString(json, "avatarUrl");
		return new RoleActor(displayName, type, name, avatarUrl);
	}

}
