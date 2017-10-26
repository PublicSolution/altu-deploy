package org.psolution.altu.deployment.core.signer

import org.psolution.altu.deployment.core.security.CertAuthenticationHandler

object JarArtifactSigner {

  def sign(jarRef: String)(implicit conf: Configuration, auth: CertAuthenticationHandler): String = {
    return "Mock"
  }

}
