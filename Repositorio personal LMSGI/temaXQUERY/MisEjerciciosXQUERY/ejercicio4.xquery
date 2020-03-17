for $superheroe in doc('superheroes.xml')/marvel/superheroe
let $poderesSuperheroe := $superheroe/@poderes
let $amigosSuperheroe := $superheroe/@amigos
where contains(lower-case($poderesSuperheroe), 'fuerza') and contains (lower-case($amigosSuperheroe), 'iron man')
return <superheroe nombre="{data($superheroe/@nombre)}"> { data($poderesSuperheroe) } { data($amigosSuperheroe)}</superheroe>