package co.simplon.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.domain.Photo;

public interface PhotoDao extends JpaRepository<Photo, Long> {
//	public List<Photo> findByCeramisteId(Long ceramisteId);
//	public List<Photo> findByUtilisateursNom(String nom);
//	@Query("select p from Photo p order by rand()")
//	public List<Photo> listAleaPhoto(Photo photo);
;
}
