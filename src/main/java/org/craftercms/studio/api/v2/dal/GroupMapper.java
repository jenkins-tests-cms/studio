/*
 * Copyright (C) 2007-2018 Crafter Software Corporation. All rights reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.craftercms.studio.api.v2.dal;

import java.util.List;
import java.util.Map;

public interface GroupMapper {

    List<GroupDAO> getAllGroupsForOrganization(Map params);

    void createGroup(Map params);

    void updateGroup(Map params);

    void deleteGroup(Map params);

    GroupDAO getGroup(Map params);

    GroupDAO getGroupByName(Map params);

    List<UserDAO> getGroupMembers(Map params);

    Integer addGroupMembers(Map params);

    List<Integer> getUserIdsForUsernames(Map params);

    void removeGroupMembers(Map params);

    Integer groupExists(Map params);
}
