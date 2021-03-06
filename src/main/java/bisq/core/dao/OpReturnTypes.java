/*
 * This file is part of Bisq.
 *
 * Bisq is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * Bisq is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Bisq. If not, see <http://www.gnu.org/licenses/>.
 */

package bisq.core.dao;

/**
 * Provides byte constants for distinguishing the type of a DAO transaction used in the OP_RETURN data.
 */
public class OpReturnTypes {
    public static final byte COMPENSATION_REQUEST = (byte) 0x01;
    public static final byte PROPOSAL = (byte) 0x02;
    public static final byte BLIND_VOTE = (byte) 0x03;
    public static final byte VOTE_REVEAL = (byte) 0x04;
    public static final byte LOCK_UP = (byte) 0x05;
    public static final byte UNLOCK = (byte) 0x06;
}
