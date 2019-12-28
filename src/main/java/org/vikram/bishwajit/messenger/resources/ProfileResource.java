/**
 * 
 */
package org.vikram.bishwajit.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vikram.bishwajit.messenger.model.Profile;
import org.vikram.bishwajit.messenger.service.ProfileService;

/**
 * @author Bishwajit.
 *
 */
@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {

	ProfileService profileService = new ProfileService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Profile> getMessages() {
		return profileService.getListProfile();
	}

	@GET
	@Path("/{profileId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Profile getProfileById(@PathParam("profileId") Long profileId) {
		return profileService.getProfile(profileId);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Profile addProfile(Profile profile) {
		return profileService.addProfile(profile);
	}

	@PUT
	@Path("/{profileId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Profile updateProfile(@PathParam("profileId") long id, Profile profile) {
		profile.setId(String.valueOf(id));
		return profileService.updateProfile(profile);
	}

	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public Profile deleteProfile(@PathParam("profileId") Long id) {
		return profileService.removeProfile(id);
	}

}
