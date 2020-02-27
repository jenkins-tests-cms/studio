/*
 * Copyright (C) 2007-2020 Crafter Software Corporation. All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3 as published by
 * the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.craftercms.studio.api.v2.dal;

import java.io.Serializable;
import java.util.List;

public class RemoteRepositoryInfo implements Serializable {

    private static final long serialVersionUID = -47166234696510116L;

    private String name;
    private String url;
    private String fetch;
    private String pushUrl;
    private List<String> branches;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    public String getFetch() { return fetch; }
    public void setFetch(String fetch) { this.fetch = fetch; }

    public String getPushUrl() { return pushUrl; }
    public void setPushUrl(String pushUrl) { this.pushUrl = pushUrl; }

    public List<String> getBranches() { return branches; }
    public void setBranches(List<String> branches) { this.branches = branches; }
}
